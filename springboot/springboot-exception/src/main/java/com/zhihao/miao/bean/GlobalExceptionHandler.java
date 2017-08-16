package com.zhihao.miao.bean;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 可以在全局异常处理的类中进行具体的异常处理，也可以在全局异常类中进行所有异常的处理，
 * @ExceptionHandler的value值不同。
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public String ArithmeticHandler(Exception e){
        return "global error " + e.getClass().getName();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String error(Exception e){
        return "global error" + e.getMessage();
    }
}
