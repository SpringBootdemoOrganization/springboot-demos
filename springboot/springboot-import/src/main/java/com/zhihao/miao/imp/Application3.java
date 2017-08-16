package com.zhihao.miao.imp;

import com.zhihao.miao.imp.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@Import(MyImportBeanDefinitionRegistrar.class)
public class Application3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application3.class,args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(People.class));
    }
}
