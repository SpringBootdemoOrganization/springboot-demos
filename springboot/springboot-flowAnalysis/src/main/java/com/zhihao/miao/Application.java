package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/7
 * @since 1.0
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //实例化SpringApplication对象，然后调用run方法
        SpringApplication application = new SpringApplication(Application.class);
        ConfigurableApplicationContext context = application.run(args);

        //直接调用静态的run方法（内部转换成第一种调用方法）
        //ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
    }
}
