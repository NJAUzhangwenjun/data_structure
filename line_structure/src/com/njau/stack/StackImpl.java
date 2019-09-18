package com.njau.stack;

import java.util.ArrayList;

/**
 * @author 张文军 @Description: @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/514:26
 */
public class StackImpl<E> implements Stack<E> {

  ArrayList array;
  int count = -1;

    @Override
    public String toString() {
        return "StackImpl{" +
                "array=" + array +
                ", count=" + count +
                '}';
    }

    public StackImpl(int capacity) {
    this.array = new ArrayList(capacity);
  }

  @Override
  public int getSize() {
    return array.size();
  }

  @Override
  public Boolean isEmpty() {
    return array.isEmpty();
  }

  @Override
  public void push(E e) {
    count++;
    array.add(e);
  }

  @Override
  public E pop() {
    return (E) array.remove(count--);
  }

  @Override
  public E peek() {
    return (E) array.get(count);
  }
}
