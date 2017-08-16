package com.zhihao.miao;

import com.zhihao.miao.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
        //System.out.println(context.getEnvironment().getProperty("local.ip"));
        //UserConfig userConfig = context.getBean(UserConfig.class);
        //userConfig.show();
        //UserConfig2 userConfig = context.getBean(UserConfig2.class);
        //userConfig.show();
        //JdbcConfig jdbcConfig = context.getBean(JdbcConfig.class);
        //jdbcConfig.show();
        //DataSourceConfig dataSourceConfig = context.getBean(DataSourceConfig.class);
        //dataSourceConfig.show();
        //TomcatProperties tomcatProperties = context.getBean(TomcatProperties.class);
        //tomcatProperties.show();
        String username = context.getEnvironment().getProperty("jdbc.root.user");
        String password = context.getEnvironment().getProperty("jdbc.root.password");
        System.out.println("username==="+username);
        System.out.println("password==="+password);
        context.close();
    }
}
