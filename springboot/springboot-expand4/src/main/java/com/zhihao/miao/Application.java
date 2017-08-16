package com.zhihao.miao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
public class Application {

    @Value("${server.host:localhost}")
    private String serverHost;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        Map<String,Object> defaultProperties = new HashMap<>();
        defaultProperties.put("server.host","192.168.1.111");
        defaultProperties.put("server.ip","8080");
        application.setDefaultProperties(defaultProperties);
//        Properties defaultProperties2 = new Properties();
//        defaultProperties2.put("server.ip","8080");
//        application.setDefaultProperties(defaultProperties2);
        ConfigurableApplicationContext context =application.run(args);
        System.out.println(context.getBean(Application.class).serverHost);
        System.out.println(context.getEnvironment().getProperty("server.host"));
        System.out.println(context.getEnvironment().getProperty("server.ip"));
        context.close();
    }
}
