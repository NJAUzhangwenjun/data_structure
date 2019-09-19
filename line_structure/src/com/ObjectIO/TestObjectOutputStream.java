package com.ObjectIO;

import com.bean.Salary;

import java.io.*;
import java.util.ArrayList;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1911:07
 */
public class TestObjectOutputStream {
    public static void main(String[] args) throws Exception {
//        show1();
//        show2();
//        show3();
        show4();
    }

    private static void show4() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\ObjectIO\\oList.txt"));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        ArrayList<Salary> salaries = (ArrayList<Salary>) object;
        System.out.println(salaries);

    }

    private static void show3() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\ObjectIO\\oList.txt", true));
        ArrayList<Salary> salaries = new ArrayList<>();
        salaries.add(new Salary(112, "張1三", "男", 4000));
        salaries.add(new Salary(122, "張2三", "男", 4000));
        salaries.add(new Salary(132, "張3三", "男", 4000));
        salaries.add(new Salary(124, "張4三", "男", 4000));
        objectOutputStream.writeObject(salaries);
        objectOutputStream.close();
    }

    /**
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void show2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\ObjectIO\\o.txt"));

        Object o = ois.readObject();
        ois.close();
        System.out.println((Salary) o);

    }

    /**
     * @throws Exception
     */
    private static void show1() throws Exception {
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\ObjectIO\\o.txt"));
        oss.writeObject(new Salary(12, "張三", "男", 4000));
        oss.close();
    }
}
