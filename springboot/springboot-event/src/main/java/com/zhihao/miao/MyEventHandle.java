package com.zhihao.miao;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {

    /**
     * 监听spring的事件（运用停止事件,Application.stop()方法时候监听到。
     *
     */
    @EventListener
    public void eventStop(ContextStoppedEvent event){
        System.out.println("应用停止事件==========："+event.getClass());
    }


}
