package com.zhihao.miao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
@Configuration
@ConditionalOnClass(Jedis.class)
@EnableConfigurationProperties(value = {RedisProperties.class,JedisPoolConfigProperties.class})
public class RedisAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public JedisPoolConfig jedisPoolConfig(JedisPoolConfigProperties jedisPoolConfigProperties){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(jedisPoolConfigProperties.getMaxTotal());
        jedisPoolConfig.setMaxIdle(jedisPoolConfigProperties.getMaxIdle());
        jedisPoolConfig.setMaxWaitMillis(jedisPoolConfigProperties.getMaxWait());
        jedisPoolConfig.setTestOnBorrow(jedisPoolConfigProperties.isTestOnBorrow());
        jedisPoolConfig.setTestOnReturn(jedisPoolConfigProperties.isTestOnReturn());
        jedisPoolConfig.setTestWhileIdle(jedisPoolConfigProperties.isTestWhileIdle());
        return jedisPoolConfig;
    }

    @Autowired
    private JedisPoolConfig jedisPoolConfig;

    @Bean
    @ConditionalOnMissingBean
    public JedisPool jedisPool(RedisProperties redisProperties){
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,redisProperties.getHost(),redisProperties.getPort(),
                redisProperties.getTimeout(),redisProperties.getPassword());
        return jedisPool;

    }

}
