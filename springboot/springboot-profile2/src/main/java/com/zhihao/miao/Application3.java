package com.zhihao.miao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(Application3.class,args);
        String redishost = context.getEnvironment().getProperty("spring.redis.host");
        String redisdatabase = context.getEnvironment().getProperty("spring.redis.database");
        String redispassword = context.getEnvironment().getProperty("spring.redis.password");
        System.out.println(redishost);
        System.out.println(redisdatabase);
        System.out.println(redispassword);
    }
}
