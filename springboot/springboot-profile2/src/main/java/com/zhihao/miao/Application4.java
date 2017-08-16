package com.zhihao.miao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application4 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(Application4.class,args);
        System.out.println(context.getBeansOfType(Runnable.class));
    }
}
