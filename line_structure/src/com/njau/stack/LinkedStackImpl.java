package com.njau.stack;

import java.util.LinkedList;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/521:54
 */
public class LinkedStackImpl<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedStackImpl() {
        this.list = new LinkedList<E>();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.push(e);
    }

    @Override
    public E pop() {
        return list.pop();
    }

    @Override
    public E peek() {
        return list.peek();
    }
}
