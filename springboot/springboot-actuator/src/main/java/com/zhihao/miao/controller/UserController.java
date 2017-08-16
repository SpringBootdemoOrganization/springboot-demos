package com.zhihao.miao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/1
 * @since 1.0
 */
@RestController
public class UserController {

    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gaugeService;

    @GetMapping("/user/index/{id}")
    public String index(@PathVariable int id){
        counterService.increment("user home");
        if(2 == id){
            throw new NullPointerException();
        }
        return "user home";
    }

    @GetMapping("/user/price")
    public String getPrice(@RequestParam double price){
        gaugeService.submit("price",price);
        return "user price";
    }

}
