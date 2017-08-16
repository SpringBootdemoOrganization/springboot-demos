package com.zhihao.miao.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class QuartzTestServiceImpl implements QuartzTestService {

    private final static Logger logger = LoggerFactory.getLogger(QuartzTestServiceImpl.class);

    @Override
    public void run(String input) {
        logger.info("{} run, date:{}", input, System.currentTimeMillis());
    }

}
