package com.zhihao.miao.demo2;

import java.util.Arrays;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ServletConfiguration {

    //注册setvlet
    @Bean
    public ServletRegistrationBean createBookServlet(){
        ServletRegistrationBean servlet = new ServletRegistrationBean(new BookServlet(),"/book.do");
        return servlet;
    }

    //过滤哪些url
    @Bean
    public FilterRegistrationBean createFilterRegistrationBean(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new EchoFilter());
        filter.setUrlPatterns(Arrays.asList("/book.do"));
        return filter;
    }

    //配置监听器
    @Bean
    public ServletListenerRegistrationBean<StartupListener> createServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<StartupListener> listener =new ServletListenerRegistrationBean<>(new StartupListener());
        return listener;
    }
}
