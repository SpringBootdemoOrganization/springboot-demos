package com.zhihao.miao.bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/4
 * @since 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"app.version=1.0"})
public class EnvTest2 {

    @Autowired
    private ConfigurableEnvironment environment;

    @Before
    public void init(){
        EnvironmentTestUtils.addEnvironment(environment,"app.admin.user=zhangsan");
    }

    @Test
    public void testApplication(){
        Assert.assertEquals("1.0",environment.getProperty("app.version"));
        Assert.assertEquals("zhangsan",environment.getProperty("app.admin.user"));
    }
}
