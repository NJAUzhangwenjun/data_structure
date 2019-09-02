package com.njau.linkedList;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/212:04
 */
public class TestLikedList {
    public static void main(String[] args) {
//        LinkedList<User> linkedList = new LinkedList<User>();
//        User user = new User(1, "刘备");
//        User user1 = new User(2, "孙权");
//        User user2 = new User(3, "曹操");
//        linkedList.add(user);
//        linkedList.add(user1);
//        linkedList.add(user2);
//        linkedList.list();
////        System.out.println("-------------------");
////        linkedList.reversion();
////        linkedList.list();
//        System.out.println("-------------------");
//        linkedList.reversionShow();

        DoubleLinkedList<User> linkedList = new DoubleLinkedList<User>();
        User user = new User(1, "刘备");
        User user1 = new User(2, "孙权");
        User user2 = new User(3, "曹操");
        linkedList.add(user);
        linkedList.add(user1);
        linkedList.add(user2);
        linkedList.list();
    }




}
