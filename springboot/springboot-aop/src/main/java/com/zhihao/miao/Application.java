package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true,exposeProxy=true)
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        String userServiceClassname = context.getBean("userService").getClass().getName();
        System.out.println("userServiceClassname==="+userServiceClassname);

        String orderServiceclassname = context.getBean("orderService").getClass().getName();
        System.out.println("orderServiceclassname===="+orderServiceclassname);
    }
}
