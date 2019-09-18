package com.njau.stack;

/**
 * @author 张文军 @Description: @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/514:23
 */
public interface Stack<E> {
  int getSize();

  Boolean isEmpty();

  void push(E e);

  E pop();

  E peek();
}
