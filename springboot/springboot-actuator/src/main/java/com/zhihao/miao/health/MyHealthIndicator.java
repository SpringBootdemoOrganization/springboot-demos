package com.zhihao.miao.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@Component
public class MyHealthIndicator implements HealthIndicator{

    @Override
    public Health health() {
        return Health.down().withDetail("error","spring boot error").build();
    }
}
