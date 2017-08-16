package com.zhihao.miao.controller;

import com.zhihao.miao.bean.Good;
import com.zhihao.miao.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;

    @PostMapping("/addGood")
    public String addGood(@RequestBody Map<String,List<Good>> map){
        List<Good> goodsList = map.get("goodslist");
        try {
            goodService.addGood(goodsList);
            return "addGood success";
        } catch (Exception e) {
            return "addGood fail";
        }
    }
}
