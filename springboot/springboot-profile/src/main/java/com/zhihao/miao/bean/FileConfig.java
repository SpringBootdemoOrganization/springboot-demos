package com.zhihao.miao.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:jdbc.properties","classpath:user.properties"})
@PropertySources({@PropertySource("classpath:jdbc.properties"),@PropertySource("classpath:user.properties")})
public class FileConfig {
}
