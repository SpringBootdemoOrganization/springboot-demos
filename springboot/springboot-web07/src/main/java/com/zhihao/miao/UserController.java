package com.zhihao.miao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate template;

    @GetMapping("/user/home")
    public String home(){
        logger.info("user home");
        return "user home";
    }

    @PostMapping("/getselectApprovalList")
    public Map getselectApprovalList(@RequestBody Map map){
        String response = template.postForObject("https://itsmuat2.rajax.me/ITSM_BE/rest/ApprovalService/selectApprovalList",map,String.class);
        System.out.println(response);
        return new HashMap();
    }

    @PostMapping("/getUser")
    public String getUser(@RequestBody UserReq userReq){
        System.out.println(userReq);
        return "hello user";
    }

    @PostMapping("/getOrder")
    public String getUser(@RequestBody OrderReq orderReq){
        System.out.println(orderReq);
        return "hello order";
    }
}
