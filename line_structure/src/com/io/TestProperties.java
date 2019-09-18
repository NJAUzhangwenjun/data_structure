package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1716:26
 */
public class TestProperties {
    public static void main(String[] args) throws Exception {
//        show1();
        show2();
    }

    private static void show2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\e.txt"));
        for (Object o : properties.keySet()) {
            System.out.println(o + " = " + properties.get(o));
        }
    }

    private static void show1() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("1張三", "214");
        properties.setProperty("張2三", "213");
        properties.setProperty("張三3", "221");
        properties.setProperty("張三4", "121");
        for (Object value : properties.values()) {
            System.out.println((String) value);
        }
        for (Object o : properties.keySet()) {
            Object o1 = properties.get(o);

            System.out.println(o + " = " + (String) o1);
        }
        properties.store(new FileWriter(new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\e.txt"), true), "用于测试");

    }

}
