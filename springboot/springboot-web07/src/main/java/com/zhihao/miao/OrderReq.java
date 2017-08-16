package com.zhihao.miao;

public class OrderReq extends UserReq{
    private String orderid;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "token="+getToken()+",username="+getUsername()+"OrderReq{" +
                "orderid='" + orderid + '\'' +
                '}';
    }
}
