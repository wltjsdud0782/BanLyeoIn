package com.dangsya.BanLyeoIn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/soulmate")
    public String firstPage(){
        return "content/index/main";
    }
}
