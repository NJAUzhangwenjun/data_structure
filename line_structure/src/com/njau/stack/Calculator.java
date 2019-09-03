package com.njau.stack;

/**
 * @author 张文军 @Description:数组栈模拟计算器 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/311:12
 */
public class Calculator {}

/** 自定义栈 */
class ArrayStack1 {
  private int mamSize;
  private int[] stack;
  private int top = -1;

  public ArrayStack1(int mamSize) {
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
}
