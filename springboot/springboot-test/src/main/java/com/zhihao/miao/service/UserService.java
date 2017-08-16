package com.zhihao.miao.service;

import org.springframework.stereotype.Service;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@Service
public class UserService {

    public Integer addUser(String username){
        System.out.println("user dao adduser [username="+username+"]");
        if(username == null){
            return 0;
        }
        return 1;
    }
}
