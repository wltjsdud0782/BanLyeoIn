package com.dangsya.BanLyeoIn.walk.controller;

import com.dangsya.BanLyeoIn.walk.service.WalkServiceImpl;
import com.dangsya.BanLyeoIn.walk.vo.WalkVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;

@Controller
@RequestMapping("/walk")
public class WalkController {
    @Resource(name = "walkService")
    private WalkServiceImpl walkService;

    //산책 게시물 상세 조회
    @GetMapping("/walkDetail")
    public String selectWalkDetail(@RequestParam(name = "walkNum", required = false, defaultValue = "1") int walkNum, Model model) {
        System.out.println("Received walkNum: " + walkNum);

        // 산책 게시물 상세 정보 조회
        WalkVO walkDetail = walkService.selectWalkDetail(walkNum);
        // 조회된 결과를 모델에 담아서 산책 상세 페이지로 전달
        model.addAttribute("walkDetail", walkDetail);
        System.out.println(walkDetail);
        return "content/walk/walk";
    }


}
