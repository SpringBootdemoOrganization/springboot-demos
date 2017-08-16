package com.zhihao.miao.service.impl;

import com.zhihao.miao.bean.Good;
import com.zhihao.miao.service.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/7/29
 * @since 1.0
 */
@Service("goodService")
public class GoodServiceImpl implements GoodService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addGood(List<Good> goodslist) throws Exception{
        addGoodreal(goodslist);

    }

    @Transactional
    public void addGoodreal(List<Good> goodslist) throws Exception{
        for (int i = 0; i < goodslist.size(); i++) {
            Good good = goodslist.get(i);
            String sql = "insert into tb_good (good_id,good_name) values" +
                    "('"+good.getGoodId()+"','"+good.getGoodName()+"')";
            logger.info(sql);
            if("书籍".equals(good.getGoodName())){
                throw new NullPointerException("");
            }
            jdbcTemplate.execute(sql);
        }

    }


}
