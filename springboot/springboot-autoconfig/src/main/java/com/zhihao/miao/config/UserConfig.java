package com.zhihao.miao.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfig {

    /**
     * 表示在application.properties中配置的属性等于某个值的时候（havingValue配置的值），Runnable这个类自动状态，
     * 实例名为createRunnable，缺省（matchIfMissing）的时候也自动装套
     */
    @Bean
    @ConditionalOnProperty(name="runnable.enabled",havingValue = "true",matchIfMissing = true)
    public Runnable createRunnable(){
        return () -> {};
    }

    /**
     * 表示classpath中是否存在某个类的时候就会自动装配,当我们在pom文件中加入了Gson的依赖就自定装配了此对象（实例名为createGsonRunnable）
     * @return
     */
    @Bean
    @ConditionalOnClass(name="com.google.gson.Gson")
    public Runnable createGsonRunnable(){
        return () -> {};
    }

    /**
     * 当spring容器中有user对象的时候，自动装配对象为createBeanRunnable的Runnable实例
     */
    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable createBeanRunnable(){
        return () -> {};
    }


}
