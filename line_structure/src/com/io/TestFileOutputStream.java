package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1714:46
 */
public class TestFileOutputStream {
    public static void main(String[] args) throws Exception {
        long l = System.currentTimeMillis();
        show1();
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l + " 毫秒");
    }

    private static void show1() throws Exception {
        FileInputStream fip = new FileInputStream("C:\\Users\\user\\Desktop\\tutu\\my.jpg");
        byte[] bytes = new byte[1024 * 1000];
        int len = 1;
        FileOutputStream fop = new FileOutputStream(new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo", "a.jpg"), true);
        while ((len = fip.read(bytes)) != -1) {
            fop.write(bytes, 0, len);
        }
        fop.close();
        fip.close();

    }
}
