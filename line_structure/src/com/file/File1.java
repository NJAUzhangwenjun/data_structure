package com.file;

import java.io.File;
import java.io.IOException;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1616:03
 */
public class File1 {
    public static void main(String[] args) throws Exception {

//        printPath();
//        show1();
//        show2();

//        show3();

//        show4("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com", "-");

//        int add = add(100);
//        System.out.println(add);
//        int c = cheng(5);
//        System.out.println(c);
        
    }

    private static int cheng(int i) {
        if (i == 1) {
            return 1;
        }
        return cheng(i - 1) * i;
    }

    private static int add(int i) {
        if (i == 0) {
            return 0;
        }
        return add(i - 1) + i;
    }

    private static void show4(String path, String l) {
        File file = new File(path);
        String[] list = file.list();
        if (list.length <= 0 || list == null) {
            return;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(l + file1.getName());
            if (file1.isDirectory()) {
                show4(file1.getAbsolutePath(), l + "=>");
            }

        }

    }

    private static void show3() throws IOException {
        File file = new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\file\\testFile\\c.m");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        System.out.println(file.delete());
    }

    private static void show2() {
        File file = new File("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\file\\testFile\\a.txt");
        System.out.println(file);
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(file.getPath());

        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());

    }

    private static void show1() {
        File file = new File("C:\\Users\\user\\Desktop\\sum.txt");
        System.out.println(file);

    }

    private static void printPath() {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);
    }
}
