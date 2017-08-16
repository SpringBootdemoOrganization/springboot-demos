package com.zhihao.miao;

import org.springframework.stereotype.Component;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/16
 * @since 1.0
 */
@Component("jobCornBean")
public class JobCornBean {

    public void printAnotherMessage(){
        System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }
}
