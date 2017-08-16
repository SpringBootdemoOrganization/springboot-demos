package com.zhihao.miao.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
public interface RedisCacheService {


    //根据缓存key获取值
    Object getCache(Serializable cacheKey);


    //设置缓存数据的key-value，并设置失效时间，单位为秒
    boolean putCache(Serializable cacheKey, Object objValue, int expiration);

    //清除缓存
    void removeCache(Serializable cacheKey);


    //向指定list集合中添加对象，在list尾部添加对象
    boolean putListCache(Serializable cacheKey, Object objValue);


    //向指定list集合中添加对象，并指定位置坐标
    boolean putListCache(Serializable cacheKey, Object objValue,
                                int index);

    /**
     * 根据坐标，返回一段集合
     *
     * @param cacheKey
     * @param start
     *            起始坐标 头部为0
     * @param end
     *            结束坐标 尾部为-1
     * @return
     */
    public List<Object> getListCache(Serializable cacheKey, int start, int end);


    //返回结合
    List<Object> getListCache(Serializable cacheKey);

    /**
     * 裁剪list集合
     *
     * @param cacheKey
     * @param start
     *            起始坐标
     * @param end
     *            结束坐标
     * @return
     */
    boolean trimListCache(Serializable cacheKey, int start, int end);


    //添加map集合
    boolean putMapCache(Serializable cacheKey, Map<Object, Object> map);

    //map中的键值
    boolean deleteMapCache(Serializable cacheKey, Serializable mapKey);


    //获取map中的值
    Object getMapValueCache(Serializable cacheKey, Serializable mapKey);


    //缓存key是否存在
    boolean exists(Serializable cacheKey);


    //设置key的失效时间
    boolean setKeyExpire(String cacheKey, int expiration);
}
