package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1713:56
 */
public class TestOutputStream {
    public static void main(String[] args) throws Exception {
//        show1();
        show2();
    }

    private static void show2() throws Exception {
        FileOutputStream fos = new FileOutputStream(new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\b.txt"), true);
        fos.write("\n的詩歌風格sdfs豆腐乾地方,哈哈哈,fos ;;sGdf".getBytes());
        fos.close();
    }

    private static void show1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\a.txt");
        fileOutputStream.write(90);
        fileOutputStream.close();
    }
}
