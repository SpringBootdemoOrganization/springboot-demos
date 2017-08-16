package com.zhihao.miao.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {

    @Bean
    @Profile("dev")
    public Runnable createDevRunnable(){
        System.out.println("========dev========");
        return () -> {};
    }

    @Bean
    @Profile("test")
    public Runnable createTestRunnable(){
        System.out.println("========test========");
        return () -> {};
    }

    @Bean
    @Profile("pro")
    public Runnable createProRunnable(){
        System.out.println("========pro========");
        return () -> {};
    }
}
