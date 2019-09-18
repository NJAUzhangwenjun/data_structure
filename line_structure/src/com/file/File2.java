package com.file;

import java.io.File;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1712:38
 */
public class File2 {
    public static void main(String[] args) {

//        show1("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com", new MyFileFilter());

        show2("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com");

        //        show("E:\\e\\Droid4X\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\file", " ");

    }

    private static void show2(String path) {
        File file = new File(path);
        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getAbsolutePath().endsWith(".java") || pathname.isDirectory()) {
                    return true;
                } else {
                    return false;
                }
            }
        });*/

        File[] files = file.listFiles(File2::accept);
        assert null != files;
        int count = 0;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(++count + ": " + file1.getName());
            } else {
                show2(file1.getAbsolutePath());
            }
        }

    }

    private static void show1(String s, MyFileFilter myFileFilter) {
        File file = new File(s);
        File[] files = file.listFiles(myFileFilter);
        assert files != null;
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            } else {
                show1(file1.getAbsolutePath(), myFileFilter);
            }
        }
    }

    private static void show(String s, String l) {
        File file = new File(s);
        System.out.println(l + file.getName());
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (File file1 : files) {
            if (file1.isDirectory()) {
                show(file1.getAbsolutePath(), l + " ");
            } else {
                System.out.println(l + "|_\n" +
                        "      ******       ******\n" +
                        "    **********   **********\n" +
                        "  ************* *************\n" +
                        " *****************************\n" +
                        " *****************************\n" +
                        " *******伟伟 I LOVE YOU *******\n" +
                        "  ***************************\n" +
                        "    ***********************\n" +
                        "      *******************\n" +
                        "        ***************\n" +
                        "          ***********\n" +
                        "            *******\n" +
                        "              ***\n" +
                        "               *" + file1.getName());
            }
        }
    }

    private static boolean accept(File dir, String name) {
        Boolean ret;
        if (dir.isDirectory() || name.endsWith(".java")) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }
}
