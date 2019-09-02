package com.njau.construct;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/8/290:22
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
//        testGetClass();

        Properties properties = new Properties();
        ClassLoader classLoader = Test1.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);
        String clazzPath = properties.getProperty("clazzPath");
        String methName = properties.getProperty("methName");
        Class<?> aClass = Class.forName(clazzPath);
        Object newInstance = aClass.newInstance();
        Method method = aClass.getMethod(methName);
        method.invoke(newInstance);


    }



    /**
     * 获取class对象的三种方法
     * 1.Class.forName(全类目)
     * 2.类名.class
     * 3.对象.getClass()
     */
    public static void testGetClass() throws Exception {
        Class<?> clazz1 = Class.forName("com.njau.construct.Person");
        Class<Person> clazz2 = Person.class;
        Person person = new Person();
        Class<? extends Person> clazz3 = person.getClass();
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
    }



}
