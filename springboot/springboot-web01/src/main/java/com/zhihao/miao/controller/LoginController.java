package com.zhihao.miao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 在springboot里面使用jsp，需要另外加入tomcat-embed-jasper的依赖
 * 然后，需要在配置文件中，配置如下两个配置项
 *
 * spring.mvc.view.prefix=/WEB-INF/jsp
 * spring.mvc.view.suffix=.jsp
 *
 *  方法的返回值，是jsp的路径加文件名字
 *
 *  最后，不能使用@RestController注解，要使用@Controller
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password){
        if("miaozhihao".equals(username)&&"123456".equals(password)){
            return "success";
        }

        return "fail";
    }

    @GetMapping("/login")
    public String loginIndex(Model model){
        model.addAttribute("username", "miaozhihao");
        return "login";
    }

    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("admin", "miaozhihaoer");
        return "admin/index";
    }
}
