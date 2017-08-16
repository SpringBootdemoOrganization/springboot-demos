package com.zhihao.miao.controller;


import com.zhihao.miao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/queryUserById/{id}")
    @ResponseBody
    private String queryUserById(@PathVariable int id){
        return userService.queryUserById(id);
    }
}
