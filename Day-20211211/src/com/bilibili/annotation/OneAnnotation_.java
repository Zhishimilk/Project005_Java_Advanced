package com.bilibili.annotation;

import com.bilibili.enumDemo.Color;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * 元注解:
 *      @Documented 该注解会被保留在生成的API文档中
 *      @Inherited 该注解会被子类继承
 *      @Retention 该注解保留策略(时机: RetentionPolicy) , 默认保留在CLASS(字节码)阶段
 *      @Target 该注解使用的范围(ElementType)
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD})
public @interface OneAnnotation_ {
//    int value();
    Color color();
}
