package com.zhihao.miao.bean;

import java.util.Date;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
public class Good {

    private int goodId;

    private String goodName;

    private Date createTime;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
