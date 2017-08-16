package com.zhihao.miao.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/3
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestBeanConfiguration.class,Cat.class})
public class TestApplication {

    @Autowired
    public ApplicationContext context;

    @Test
    public void testNotNull(){
        Runnable runnable = context.getBean(Runnable.class);
        runnable.run();
        System.out.println("--------");

        Cat cat = context.getBean(Cat.class);
        cat.index();
    }
}
