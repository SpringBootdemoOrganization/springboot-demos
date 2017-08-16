package com.zhihao.miao.service;

import com.zhihao.miao.bean.Good;

import java.util.List;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
public interface GoodService {

    void addGood(List<Good> goodslist) throws Exception;
}
