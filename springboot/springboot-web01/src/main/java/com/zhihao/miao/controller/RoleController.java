package com.zhihao.miao.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @RestController 表示当前controller的方法的返回值可以直接用于body输出
 */
@RestController
public class RoleController {

    @GetMapping("/role/show")
    public String show(){
        return "role show";
    }
}
