package com.zhihao.miao.service.impl;

import com.zhihao.miao.service.UserService;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/28
 * @since 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public String queryUserById(int id) {
        return "user home";
    }

}
