package com.zhihao.miao;

import com.zhihao.miao.dao.UserDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/4
 * @since 1.0
 */
@RunWith(SpringRunner.class)
public class UserDaoTest {

    //使用MockBean是因为此时容器中没有UserMapper这个对象
    @MockBean
    public UserDao userDao;

    //使用BDDMockito对行为进行预测，
    @Before
    public void init(){
        BDDMockito.given(userDao.createUser("admin")).willReturn(1);
        BDDMockito.given(userDao.createUser("")).willReturn(0);
        BDDMockito.given(userDao.createUser(null)).willThrow(NullPointerException.class);
    }

    @Test(expected=NullPointerException.class)
    public void testCreateUser() {
        Assert.assertEquals(Integer.valueOf(1),userDao.createUser("admin")) ;
        Assert.assertEquals(Integer.valueOf(0),userDao.createUser("")) ;
        Assert.assertEquals(Integer.valueOf(1),userDao.createUser(null)) ;
    }
}