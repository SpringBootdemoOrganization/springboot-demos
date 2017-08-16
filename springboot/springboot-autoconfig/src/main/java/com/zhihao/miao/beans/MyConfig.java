package com.zhihao.miao.beans;

import com.zhihao.miao.condition.GBKCondition;
import com.zhihao.miao.condition.UTF8Condition;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
public class MyConfig {

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodingConvert createUTF8Encoding(){
        return new UTF8EncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodingConvert createGBKEncoding(){
        return new GBKEncodingConvert();
    }
}
