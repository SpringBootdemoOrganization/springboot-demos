package com.zhihao.miao.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootConfiguration
public class ConfigurationTest {

    @Bean
    public Map createMap(){
        Map map = new HashMap();
        map.put("username","zhihao.miao");
        map.put("age",27);
        return map;
    }
}
