package com.zhihao.miao.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/4
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvTest {

    @Autowired
    public Environment environment;

    @Test
    public void testValue(){
        Assert.assertEquals("zhihao.miao",environment.getProperty("developer.name"));

    }
}
