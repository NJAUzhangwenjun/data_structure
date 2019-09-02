package com.njau.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 张文军
 * @Description:自定义检查异常的注解类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/113:54
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Chect {
}
