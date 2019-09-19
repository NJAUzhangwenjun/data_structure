package com.encoding;

import java.io.*;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/199:31
 */
public class TestEncoding {
    public static void main(String[] args) throws Exception {
//        show1();
//        show2();
        show3();
    }

    private static void show3() throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\encoding\\gbk编码.txt"), "gbk");
        FileWriter writer = new FileWriter("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\encoding\\utf.txt", true);
        int len = 0;
        while ((len = reader.read()) != -1) {
            writer.write((char) (len));
            writer.write("\n");
        }
        reader.close();
        writer.close();
    }

    private static void show2() throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\encoding\\gbk编码.txt", true), "GBK");

        int len = 10;
        while (len != 0) {
            writer.write("爱上的肌肤时刻来到" + len--);
        }
        writer.close();
    }

    private static void show1() throws IOException {
        FileReader fr = new FileReader("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\encoding\\gbk编码.txt");
        int len = 0;
        String encoding = fr.getEncoding();
        System.out.println(encoding);
        while ((len = fr.read()) != -1) {
            System.out.println((char) len);
        }
        fr.close();
    }
}
