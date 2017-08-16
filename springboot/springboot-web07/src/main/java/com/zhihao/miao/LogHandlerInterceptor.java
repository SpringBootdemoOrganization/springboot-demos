package com.zhihao.miao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


public class LogHandlerInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //请求执行之前调用
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==========preHandle==========" + handler.getClass());
        String token = request.getHeader("token");
        System.out.println(token);
        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        final Method method = handlerMethod.getMethod();
        Class<?>[] classes = method.getParameterTypes();
        Class paramtype = classes[0];
        Object object = paramtype.newInstance();
        System.out.println(object instanceof UserReq);
        if(object instanceof UserReq){
            UserReq userReq =(UserReq)object;
            System.out.println(userReq);
        }
        return true;
    }

    //请求之后，且页面渲染之前调用
    @Override
    public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
       String UserAgent = request.getHeader("User-Agent");
       logger.info("UserAgent==="+UserAgent);
       String remoteIp = request.getRemoteHost()+","+request.getRequestURI();
       logger.info("remoteIp"+remoteIp);

    }

    //页面渲染之后调用，一般用于资源清理操作
    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("===========afterCompletion=========");
    }
}
