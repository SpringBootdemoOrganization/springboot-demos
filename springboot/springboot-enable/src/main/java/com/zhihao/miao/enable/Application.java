package com.zhihao.miao.enable;


import com.zhihao.miao.enable.bean.ServerBean;
import com.zhihao.miao.enable.bean.UserRunnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableConfigurationProperties
@ComponentScan

//@SpringBootApplication
//@EnableAsync
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        System.out.println(context.getBean(ServerBean.class));
//        context.getBean(Runnable.class).run();
//        System.out.println("end");
    }
}
