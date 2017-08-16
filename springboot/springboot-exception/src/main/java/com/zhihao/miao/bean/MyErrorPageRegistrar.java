package com.zhihao.miao.bean;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

//@Component
public class MyErrorPageRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        //具体的错误码错误异常页面
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        //指定具体异常的错误定制页面
        ErrorPage argspage = new ErrorPage(IllegalArgumentException.class,"/argsException.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        registry.addErrorPages(e404,e500,argspage);
    }
}
