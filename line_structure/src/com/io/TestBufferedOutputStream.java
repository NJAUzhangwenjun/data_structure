package com.io;

import java.io.*;

/**
 * @ author 张文军
 * @ Description:
 * @ Company:南京农业大学工学院
 * @ version:1.0
 * @ date 2019/9/1814:51
 */
public class TestBufferedOutputStream {

    public static void main(String[] args) throws Exception {
        long l = System.currentTimeMillis();
        show1();
        long l1 = System.currentTimeMillis();
        System.out.println("图片复制用时：" + (l1 - l) + "毫秒。");
    }

    /**
     * 利用缓冲流来复制文件
     *
     * @throws Exception
     */
    private static void show1() throws Exception {

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\a.md", true));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\g.txt"));
        byte[] bytes = new byte[1024 * 10];
        int len = 0;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.write("------------------------------------------------".getBytes());
        File file = new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\io\\testIo\\g.txt");
        bufferedOutputStream.close();
        bufferedInputStream.close();
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
