package com.zhihao.miao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Order(2)
//@Component
public class ServerStartedReport implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========ServerStartedReport启动====="+ LocalDateTime.now());
    }
}
