package com.zhihao.miao;

import com.zhihao.miao.service.RedisCacheService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/31
 * @since 1.0
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        RedisCacheService redisCacheService = context.getBean(RedisCacheService.class);
        boolean flag = redisCacheService.putCache("name","miaozhihao00",3000);
        System.out.println(flag);
        Object object = redisCacheService.getCache("name");
        System.out.println(object);
        context.close();
    }
}
