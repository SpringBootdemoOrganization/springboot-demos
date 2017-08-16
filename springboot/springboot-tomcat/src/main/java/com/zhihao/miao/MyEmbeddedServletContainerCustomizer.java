package com.zhihao.miao;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
//@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

    public void customize(ConfigurableEmbeddedServletContainer container) {
        //org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory
        //System.out.println(container.getClass().getName());

        TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory) container;
        //设置启动端口
        factory.setPort(10003);
        //设置tomcat路径
        factory.setBaseDirectory(new File("/Users/naeshihiroshi/Desktop"));

        //定制访问日志
        factory.addContextValves(getLogAccessLogValve());
        factory.addInitializers((servletContext) -> {
            System.out.println("=========servletContext startup==========");
        });
        factory.addConnectorCustomizers(new myTomcatConnectorCustomizer());
    }

    private AccessLogValve getLogAccessLogValve() {
        AccessLogValve log = new AccessLogValve();
        log.setDirectory("/Users/naeshihiroshi/Desktop/logs");
        log.setEnabled(true);
        log.setPattern("%h %l %u %t \"%r\" %s %b");
        log.setPrefix("springboot-access-log");
        log.setSuffix(".txt");
        return log;
    }

    class myTomcatConnectorCustomizer implements TomcatConnectorCustomizer {

        public void customize(Connector connector) {
            //HTTP/1.1
            System.out.println("===========" + connector.getProtocol());
            //class org.apache.coyote.http11.Http11NioProtocol
            System.out.println("===========" + connector.getProtocolHandler().getClass());

            Http11NioProtocol protocal = (Http11NioProtocol) connector.getProtocolHandler();
            protocal.setMaxConnections(2000);  //设置最大连接数
            protocal.setMaxThreads(500); //设置最大的线程数
        }

    }
}
