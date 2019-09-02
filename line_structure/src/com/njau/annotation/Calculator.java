package com.njau.annotation;

/**
 * @author 张文军
 * @Description:自定义计算器
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/113:49
 */
public class Calculator {
    @Chect
    public void add() {
        System.out.println("10+2=" + (10 + 2));
    }
    @Chect
    public void les() {
        System.out.println("10-2=" + (10 - 2));
    }
    @Chect
    public void mul() {
        System.out.println("10*2=" + (10 * 2));
    }
    @Chect
    public void exc() {
        System.out.println("10/2=" + (10 / 2));
    }
    public void noException() {
        System.out.println("10=" + (10));
    }
}
