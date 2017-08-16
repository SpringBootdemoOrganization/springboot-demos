package com.zhihao.miao;

import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("接收到事件："+event.getClass());
    }

}
