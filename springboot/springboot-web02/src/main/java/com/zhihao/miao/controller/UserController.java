package com.zhihao.miao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @GetMapping("/logout")
    public String logout(Model model){
        model.addAttribute("username","zhihao.miao");
        model.addAttribute("logout","true");
        return "logout";
    }
}
