package com.zhihao.miao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/4
 * @since 1.0
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/user/home")
    public String home(){
        logger.info("user home");
        return "user home";
    }

    @GetMapping("/user/show")
    public String show(@RequestParam("id") String id){
        logger.info("user show");
        return "show"+id;
    }
}
