package com.zhihao.miao.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/31
 * @since 1.0
 */
@Component
public class UserDao {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void addUser(){
        logger.debug("user dao debug log");
        logger.info("user dao info log");
        logger.warn("user dao warn log");
        logger.error("user dao error log");
    }
}
