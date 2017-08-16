package com.zhihao.miao.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig2 {

    @Value("${tomcat.port:10000}")
    private int port;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println(port);
        System.out.println(environment.getProperty("tomcat.port",Integer.class,10000));
    }
}
