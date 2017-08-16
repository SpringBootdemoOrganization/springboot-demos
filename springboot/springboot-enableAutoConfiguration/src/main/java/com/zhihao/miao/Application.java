package com.zhihao.miao;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public Gson createGson(){
        return new Gson();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(Application.class,args);
        System.out.println(context.getBeansOfType(Gson.class));
    }
}
