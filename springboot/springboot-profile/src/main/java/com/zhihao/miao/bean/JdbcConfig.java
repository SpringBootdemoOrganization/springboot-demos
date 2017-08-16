package com.zhihao.miao.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${dricverClassName}")
    private String dricverClassName;

    public void show(){
        System.out.println("username====="+username);
        System.out.println("password====="+password);
        System.out.println("jdbcUrl====="+jdbcUrl);
        System.out.println("dricverClassName==="+dricverClassName);
    }

}
