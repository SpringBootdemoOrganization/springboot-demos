package com.zhihao.miao.service;

import com.zhihao.miao.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/31
 * @since 1.0
 */
@Component
public class UserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDao userDao;

    public void addUser(){
        logger.debug("user service debug log");
        logger.info("user service info log");
        logger.warn("user service warn log");
        logger.error("user service error log");
        userDao.addUser();
    }
}
