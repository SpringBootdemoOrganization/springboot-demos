package com.zhihao.miao.bean;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/3
 * @since 1.0
 */
@TestConfiguration
public class TestBeanConfiguration {

    @Bean
    public Runnable createRunnable(){
        return () -> System.out.println("=====createRunnable=======");
    }
}
