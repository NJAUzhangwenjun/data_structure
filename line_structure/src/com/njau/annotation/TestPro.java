package com.njau.annotation;

import java.lang.reflect.Method;

/**
 * @author 张文军
 * @Description:解析注解
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/8/3114:02
 */
@Pro(clazzPath = "com.njau.construct.Person",methName = "say")
public class TestPro {
    public static void main(String[] args) throws Exception {
        //获取当前类的Class(字节码文件对象)、
        Class<TestPro> testProClass = TestPro.class;
        //获取注解的对象
        Pro proClassAnnotation = testProClass.getAnnotation(Pro.class);
        //获取注解的属性
        String clazzPath = proClassAnnotation.clazzPath();
        String methName = proClassAnnotation.methName();
        //用反射的方法创建对象和运行方法
        Class<?> aClass = Class.forName(clazzPath);
        Object instance = aClass.newInstance();
        Method method = aClass.getMethod(methName);
        method.invoke(instance);
    }
}
