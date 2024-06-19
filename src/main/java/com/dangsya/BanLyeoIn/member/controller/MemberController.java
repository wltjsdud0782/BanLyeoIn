package com.dangsya.BanLyeoIn.member.controller;

import com.dangsya.BanLyeoIn.member.service.MemberService;
import com.dangsya.BanLyeoIn.member.vo.MemberVO;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    // 회원가입 페이지 이동
    @GetMapping("/goJoin")
    public String goJoin(){
        return "content/member/join";
    }

    // 회원가입 기능 구현
    @PostMapping("/join")
    public String join(MemberVO memberVO){
        memberService.insertMemberInfo(memberVO);
        return "redirect://soulmate";
    }

    // 로그인 기능 구현 (비동기)
    @ResponseBody
    @PostMapping("/login")
    public MemberVO login(MemberVO memberVO, HttpSession session){
        MemberVO vo = memberService.selectMeberInfo(memberVO);
        session.setAttribute("loginInfo", vo); // loginInfo에 memberVO 저장
        session.setMaxInactiveInterval(60 * 30); // 로그인 30분 유지
        return vo;
    }

    // 아이디 중복 체크
    @ResponseBody
    @GetMapping("/dupleChk")
    public boolean dupleChk(@RequestBody MemberVO memberVO){
        if (memberVO.getMemberId() != null) {
            int result = memberService.dupleChk(memberVO.getMemberId());
            if(result > 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
