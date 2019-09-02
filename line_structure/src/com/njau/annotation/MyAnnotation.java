package com.njau.annotation;

import java.lang.annotation.*;

/**
 * @author 张文军
 * @Description:自定义接口类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/8/3111:09
 */
@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD,ElementType.TYPE, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    int getCode() default 0;

    int value() default 1;

    String name() default "南京农业大学工学院-张文军";

    boolean isMyAnnotation() default false;

}
