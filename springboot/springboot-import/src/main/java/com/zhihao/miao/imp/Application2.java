package com.zhihao.miao.imp;


import com.zhihao.miao.imp.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


@EnableLog(name="com.zhihao.miao")
public class Application2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application2.class,args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(People.class));
    }

}
