package com.zhihao.miao.imp.bean;


import org.springframework.context.annotation.Bean;

public class MyConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
}
