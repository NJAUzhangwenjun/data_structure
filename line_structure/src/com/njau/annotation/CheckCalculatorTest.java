package com.njau.annotation;

import java.lang.reflect.Method;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/113:57
 */
public class CheckCalculatorTest {
    public static void main(String[] args) {
        /**
         * 获取字节码
         */
        Calculator calculator = new Calculator();
        Class<? extends Calculator> aClass = calculator.getClass();

        /**
         * 获取所有方法
         */
        Method[] methods = aClass.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Chect.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                  //记录异常信息

                }
            }
        }
    }
}
