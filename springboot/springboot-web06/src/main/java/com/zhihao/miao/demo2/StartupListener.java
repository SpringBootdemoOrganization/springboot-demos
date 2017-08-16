package com.zhihao.miao.demo2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        System.out.println("=================");
        System.out.println("application is started");
    }

    public void contextDestroyed(ServletContextEvent event) {

    }

}
