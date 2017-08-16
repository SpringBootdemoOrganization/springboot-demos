package com.zhihao.miao;

import org.apache.catalina.valves.AccessLogValve;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@Configuration
public class WebServerConfiguration {

    @Bean
    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory(){
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(10008);
        //容器定义异常
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        factory.addInitializers((servletContext) -> {
            System.out.println("=========servletContext startup==========");
            servletContext.setAttribute("startup", "true");
        });
        factory.addContextValves(getLogAccessLogValve());
        return factory;
    }

    private AccessLogValve getLogAccessLogValve(){
        AccessLogValve log = new AccessLogValve();
        log.setDirectory("e:/tmp/logss");
        log.setEnabled(true);
        log.setPattern("%h %l %u %t \"%r\" %s %b");
        log.setPrefix("springboot-access-log");
        log.setSuffix(".txt");
        return log;
    }

}
