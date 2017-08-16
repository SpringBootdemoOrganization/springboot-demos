package com.zhihao.miao.imp;

import com.zhihao.miao.imp.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableImportConfig
public class Application4 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application4.class,args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(People.class));
    }
}
