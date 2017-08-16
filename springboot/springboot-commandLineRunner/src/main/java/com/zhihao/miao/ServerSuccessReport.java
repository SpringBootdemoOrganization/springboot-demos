package com.zhihao.miao;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
//@Component
public class ServerSuccessReport implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=====应用已经成功启动====="+ Arrays.asList(args));
    }
}
