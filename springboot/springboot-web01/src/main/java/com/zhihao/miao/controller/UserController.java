package com.zhihao.miao.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @GetMapping、@PostMapping 是spring4.3中的新特性
 *
 */
@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/user/home",method=RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "user home";
    }

    @GetMapping("/user/show")
    @ResponseBody
    public String show(){
        return "user show";
    }

    //直接接收HttpServletRequest原生的Reuqest
    @GetMapping("/user/edit")
    @ResponseBody
    public String edit(HttpServletRequest req){
        return "user edit "+req.getRemoteHost();
    }

    /**
     *  获取url的参数 /user/1, /user/2
     */
    @GetMapping("/user/{id}")
    @ResponseBody
    public String display(@PathVariable("id")String id){
        return "user display, id ="+id;
    }

    /**
     * @RequestParam 注解默认是参数必须提供值
     * defaultValue 设置默认值
     */
    @PostMapping("/user/create")
    @ResponseBody
    public String create(@RequestParam(value="username",defaultValue="admin")String username,@RequestParam(value="password",required=false)String password){
        return "user create,username="+username+",password="+password;
    }

    @DeleteMapping("/user/deleteUserById/{id}")
    public String deleteUserById(@PathVariable("id") String id){
        return "删除id为："+id+"的用户";
    }

    @PutMapping("/puttingById/{id}")
    public String puttingById(@PathVariable("id") String id){
        logger.info("id====="+id);
        return id;
    }
}

