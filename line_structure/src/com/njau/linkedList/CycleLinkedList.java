package com.njau.linkedList;

/**
 * @author 张文军 @Description:数据结构-->>>链表 @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/211:19
 */
public class CycleLinkedList<E> {

  /** 头结点，不存放数据 */
  private Node first;

  public Node getHear() {
    return first;
  }

  /** 节点个数 */
  private int size;

  public class Node {
    /** 存放的数据 */
    private E data;
    /** 指向下一个节点 */
    private Node next;


    public Node() {}

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
      return "Node{" + "data=" + data + '}';
    }
  }

  public CycleLinkedList() {
    /** 创建虚拟头结点 */
    first = new Node();
    first.next = first;
  }

  public void add(E data) {
    Node node = new Node(data);
    Node cur = first;
    node.next = first;
    cur.next = node;
  }
}
