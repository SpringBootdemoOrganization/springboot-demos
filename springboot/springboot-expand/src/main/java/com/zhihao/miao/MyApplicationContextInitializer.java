package com.zhihao.miao;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@Order(2)
public class MyApplicationContextInitializer implements ApplicationContextInitializer{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("bean count====="+applicationContext.getBeanDefinitionCount());
    }
}
