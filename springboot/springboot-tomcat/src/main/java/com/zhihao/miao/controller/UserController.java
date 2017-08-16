package com.zhihao.miao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/user/index")
    private String index(){
        logger.info("user home");
        return "user home";
    }
}
