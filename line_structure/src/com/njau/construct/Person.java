package com.njau.construct;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/8/290:22
 */
public class Person {
    String username;
    Integer age;

    public void say() {
        System.out.println("reflect");
    }

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
