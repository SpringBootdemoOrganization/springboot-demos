package com.zhihao.miao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/28
 * @since 1.0
 */
@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.zhihao.miao.service..*.*(..))")
    public void log(){
        logger.info("before method log done"+ AopContext.currentProxy().getClass());
        //logger.info("before method log done");
    }

    //可以通过joinPoint取到aop的类名，方法参数，方法签名
    @After("execution(* com.zhihao.miao.service..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        logger.info("after method log done "+joinPoint.getTarget().getClass()+",args="+ Arrays.asList(joinPoint.getArgs())+",method="+joinPoint.getSignature());
    }
}
