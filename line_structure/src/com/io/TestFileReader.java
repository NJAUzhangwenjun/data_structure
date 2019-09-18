package com.io;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1715:44
 */
public class TestFileReader {
    public static void main(String[] args) throws Exception {
        show();
    }

    private static void show() throws Exception {
        FileReader reader = new FileReader("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\a.txt");
        FileWriter writer = new FileWriter("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\c.txt", true);

        int len = 0;
        while ((len = reader.read()) != -1) {
            System.out.print((char) len);
            writer.write(len);
        }
        System.out.println(reader.getEncoding());

        writer.close();
        reader.close();

    }
}
