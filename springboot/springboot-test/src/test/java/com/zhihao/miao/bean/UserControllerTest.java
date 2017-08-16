package com.zhihao.miao.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/4
 * @since 1.0
 */
@RunWith(SpringRunner.class)
//指定web环境，随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    //这个对象是运行在web环境的时候加载到spring容器中
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHome(){
        String context = testRestTemplate.getForObject("/user/home",String.class);
        Assert.assertEquals("user home",context);
    }

    @Test
    public void testShow(){
        String context = testRestTemplate.getForObject("/user/show?id=100",String.class);
        Assert.assertEquals("show10",context);
    }
}
