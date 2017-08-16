package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@SpringBootApplication(exclude = {WebSocketAutoConfiguration.class})
@PropertySource(value = "classpath:db.properties")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
