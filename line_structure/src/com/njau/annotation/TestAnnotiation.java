package com.njau.annotation;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/8/3111:06
 */
@MyAnnotation
public class TestAnnotiation {

    @MyAnnotation
    String name;


    public static void main(String[] args) {
        System.out.println("main");
       testMyAnnotation();
    }


    @MyAnnotation(getCode = 1,name = "zhangsan",isMyAnnotation = true)
    public static void testMyAnnotation() {
        System.out.println("testMyAnnotation");
    }
}
