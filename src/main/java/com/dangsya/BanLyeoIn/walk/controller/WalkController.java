package com.dangsya.BanLyeoIn.walk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/walk")
public class WalkController {

    @GetMapping("/map")
    public String walkMap(Model model){
      return "content/walk/walk";
    }
}
