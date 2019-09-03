package com.njau.stack;

import java.util.Scanner;

/**
 * @author 张文军 @Description:数组模拟堆栈 @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/221:49
 */
public class ArrayStack {
  private int mamSize;
  private int[] stack;
  private int top = -1;

  public ArrayStack(int mamSize) {
    this.mamSize = mamSize;
    this.stack = new int[mamSize];
  }

  public Boolean isFull() {
    return top == mamSize - 1;
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public void push(int data) {
    if (!isFull()) {
      top++;
      stack[top] = data;
    } else {
      System.out.println("堆栈已满！");
    }
  }

  public int pop() {
    if (!isEmpty()) {
      top--;
      return stack[top + 1];
    } else {
      throw new RuntimeException("堆栈为空！");
    }
  }

  private int getStackHead() {
    return stack[top];
  }

  public void list() {
    if (!isEmpty()) {
      for (int i = top; i >= 0; i--) {
        System.out.println(stack[i]);
      }
    } else {
      throw new RuntimeException("堆栈为空！");
    }
  }

  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(3);

    Scanner scanner = new Scanner(System.in);
    Boolean loop = true;
    while (loop) {
      System.out.println("s 展示");
      System.out.println("a 添加");
      System.out.println("g 取数据");
      System.out.println("h 显示头数据");
      System.out.println("e 退出");
      char key = scanner.next().charAt(0);
      switch (key) {
        case 's':
          stack.list();
          break;
        case 'a':
          System.out.println("请输入数据：");
          int i = scanner.nextInt();
          stack.push(i);
          break;
        case 'g':
          try {
            int queue1 = stack.pop();
            System.out.println("取出的数据是:" + queue1);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'h':
          try {
            int queueHead = stack.getStackHead();
            System.out.println("头数据:" + queueHead);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'e':
          loop = false;
          break;
        default:
          break;
      }
    }
    System.out.println("exit !");
  }
}
