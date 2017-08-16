package com.zhihao.miao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application2 {
    public static void main(String[] args) {
       SpringApplication springApplication = new SpringApplication(Application.class);
       springApplication.setAdditionalProfiles("test");
        ConfigurableApplicationContext context =springApplication.run(args);
        String redishost =context.getEnvironment().getProperty("spring.redis.host");
        System.out.println(redishost);
    }
}
