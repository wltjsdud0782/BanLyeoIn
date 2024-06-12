package com.dangsya.BanLyeoIn.member.controller;

import com.dangsya.BanLyeoIn.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberService")
    private MemberService memberService;

    @GetMapping("/goJoin")
    public String goJoin(){
        return "content/member/join";
    }

    @PostMapping("/join")
    public String join(){
        return "redirect://soulmate";
    }

}
