package com.zhihao.miao.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

    @Autowired
    private Environment environment;

    @Value("${local.name}")
    private String localName;

    @Value("${local.port}")
    private int port;

    public void show(){
        System.out.println(environment.getProperty("local.ip"));
        //重载方法，使得读取到的数据是Integer类型的
        System.out.println(environment.getProperty("local.port",Integer.class));
        System.out.println(localName);
        System.out.println(port);

        //在配置文件中引用引用已有的变量
        System.out.println(environment.getProperty("local.url"));
    }
}
