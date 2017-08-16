package com.zhihao.miao.condition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTF8Condition implements Condition{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String encoding = context.getEnvironment().getProperty("project.encoding");
        logger.info("encoding==="+encoding);
        if(encoding != null){
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }
}
