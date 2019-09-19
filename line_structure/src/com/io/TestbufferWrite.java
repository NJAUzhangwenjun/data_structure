package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1815:31
 */
public class TestbufferWrite {
    public static void main(String[] args) throws Exception {
        long l = System.currentTimeMillis();
        show1();
        long l1 = System.currentTimeMillis();
        System.out.println("复制用时：" + (l1 - l) + "毫秒。");
    }

    /**
     * 用字符缓冲流来复制文件
     *
     * @throws Exception
     */
    private static void show1() throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\a.txt", true));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\a.md"));

        char[] chars = new char[1024];
        int len = 0;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }

//        while (bufferedReader.readLine() != null) {
//            bufferedWriter.write(bufferedReader.readLine());
//            bufferedWriter.newLine();
//        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}
