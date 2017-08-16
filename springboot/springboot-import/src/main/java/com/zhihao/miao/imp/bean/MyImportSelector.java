package com.zhihao.miao.imp.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * selectImports方法的返回值，必须是一个class（全称），该class会被spring容器所托管起来
 */
public class MyImportSelector implements ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //获取注解的属性信息
        System.out.println(importingClassMetadata.getAllAnnotationAttributes(EnableLog.class.getName()));
        /**
         * 这里可以获取到注解的详细信息，然后根据信息去动态的返回需要被spring容器管理的bean
         */
        return new String[]{"com.zhihao.miao.imp.bean.User",People.class.getName(),MyConfig.class.getName()};
    }

}
