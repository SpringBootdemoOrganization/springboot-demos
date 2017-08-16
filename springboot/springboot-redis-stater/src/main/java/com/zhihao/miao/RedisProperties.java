package com.zhihao.miao;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
@ConfigurationProperties(prefix="redis")
public class RedisProperties {
    private String host;
    private Integer port;
    private Integer timeout;
    private String password;
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public Integer getPort() {
        return port;
    }
    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}