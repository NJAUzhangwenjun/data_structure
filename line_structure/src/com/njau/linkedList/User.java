package com.njau.linkedList;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/212:13
 */
public class User {
    private int no;
    private String username;

    public User(int no, String username) {
        this.no = no;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", username='" + username + '\'' +
                '}';
    }

}
