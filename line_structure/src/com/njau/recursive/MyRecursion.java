package com.njau.recursive;

/**
 * @author 张文军 @Description:递归 @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/312:23
 */
public class MyRecursion {
    public static void main(String[] args) {
        // print(3);
        System.out.println("3!=" + print1(3));
    }

    public static void print(Long n) {
        if (n >= 1) {
            System.out.println("n=" + n);
            print(--n);
        } else {
            System.out.println(n);
        }
    }

    public static int print1(int n) {
        if (n > 1) {
            return print1(n - 1) * n;
        } else {
            return 1;
        }
    }
}
