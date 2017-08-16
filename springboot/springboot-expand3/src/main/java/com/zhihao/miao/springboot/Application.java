package com.zhihao.miao.springboot;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        //关闭默认的banner，默认的值为Banner.Mode.CONSOLE
//        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
