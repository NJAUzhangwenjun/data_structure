package com.njau.linkedList;

import java.util.Stack;

/**
 * @author 张文军
 * @Description:数据结构-->>>链表
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/211:19
 */
public class LinkedListMy<E> {

    /**
     * 头结点，不存放数据
     */
    private Node hear;

    public Node getHear() {
        return hear;
    }

    /**
     * 节点个数
     */
    private int size;


    public class Node {
        /**
         * 存放的数据
         */
        private E data;
        /**
         * 指向下一个节点
         */
        private Node next;

        public Node() {
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public LinkedListMy() {
        /**
         * 创建虚拟头结点
         */
        hear = new Node();
    }


    /**
     * 添加
     */
    public void add(E data) {
        Node node = new Node();
        node.data = data;
        Node temp = hear;
        /**
         * 找到next为null的节点，即最后的节点
         */
        while (temp.next != null) {
            temp = temp.next;
        }
        /**
         * 将最后节点的next为null的next指向新的节点
         */
        temp.next = node;
        size++;
    }


    /**
     * 显示链表数据
     */
    public void list() {
        Node temp = hear.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }


    /**
     * 节点反转
     */
    public void reversion() {
        Node cur = hear.next;
        Node next = null;
        Node proHead = new Node(null, null);
        while (cur != null) {
            next = cur.next;
            cur.next = proHead.next;
            proHead.next = cur;
            cur = next;
        }
        hear.next = proHead.next;
    }


    /**
     * 反向输出
     */
    public void reversionShow() {
        Stack<Node> stack = new Stack<Node>();
        Node cur = hear.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

}
