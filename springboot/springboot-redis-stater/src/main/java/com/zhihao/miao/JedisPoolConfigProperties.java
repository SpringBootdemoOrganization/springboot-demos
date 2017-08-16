package com.zhihao.miao;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@ConfigurationProperties(prefix="redis.pool")
public class JedisPoolConfigProperties {

    private int maxTotal; //最大连接数

    private int maxIdle; //最大空闲连接数

    private int minIdle; //初始化连接数

    private long maxWait; //最大等待时间

    private boolean testOnBorrow; //对拿到的connection进行validateObject校验

    private boolean testOnReturn; //在进行returnObject对返回的connection进行validateObject校验

    private boolean testWhileIdle; //定时对线程池中空闲的链接进行validateObject校验

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(long maxWait) {
        this.maxWait = maxWait;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }
}
