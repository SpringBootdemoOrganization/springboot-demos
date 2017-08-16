package com.zhihao.miao.Controller;

import com.zhihao.miao.CurrentRider;
import com.zhihao.miao.People;
import com.zhihao.miao.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/30
 * @since 1.0
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/myActivity", method = RequestMethod.POST)
    public String myActivity (@CurrentRider People people, @RequestBody User user) {
       logger.info(people+"user==="+user);
       return "hello";
    }
}
