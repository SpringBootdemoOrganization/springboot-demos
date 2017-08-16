package com.zhihao.miao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/user/home")
    public String index(){
        logger.info("user home");
        return "user home";
    }

    @GetMapping("/user/help")
    public String help(){
        logger.info("user help");
        throw new IllegalArgumentException("args is empty");
    }
}
