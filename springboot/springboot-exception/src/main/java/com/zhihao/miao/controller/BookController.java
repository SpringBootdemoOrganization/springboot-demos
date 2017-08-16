package com.zhihao.miao.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class BookController {

    //对异常进行处理，这种方式只能处理当前类中的异常,也就是局部异常处理
    @ExceptionHandler(value=FileNotFoundException.class)
    public String error(){
        return "file is not found exception";
    }

    @ExceptionHandler(value=Exception.class)
    public String excep(Exception e){
        return "not found exception: "+e.getMessage();
    }

    @GetMapping("/book/error1")
    public String error1() throws FileNotFoundException {
        throw new FileNotFoundException("book.txt not found");
    }

    @GetMapping("/book/error2")
    public String error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("Book class not found");
    }

}
