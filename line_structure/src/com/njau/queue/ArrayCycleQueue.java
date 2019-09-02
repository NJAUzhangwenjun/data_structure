package com.njau.queue;

import java.util.Scanner;

/**
 * @author 张文军
 * @Description:数组循环队列
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/23:42
 */
public class ArrayCycleQueue {
    /**
     * 数组大小
     */
    int maxiSize;
    /**
     * 指向队列的头元素
     */
    int front;
    /**
     * 指向队列的最后一个元素的下一个元素
     */
    int rear;
    /**
     * 数组
     */
    int[] arr;

    public ArrayCycleQueue(int maxiSize) {
        this.maxiSize = maxiSize;
        arr = new int[maxiSize];
        front = 0;
        rear = 0;

    }

    public Boolean isFull() {
        return front == (rear + 1) % maxiSize;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("queue is full !");
            return;
        } else {
            arr[rear] = n;
            rear = (rear + 1) % maxiSize;
        }
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty !");
        } else {
            int popData = arr[front];
            front = (front + 1) % maxiSize;
            return popData;
        }
    }

    public void showQueue() {
        if (!isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }
        } else {
            System.out.println("queue is empty !");
        }
    }

    public int getQueueHead() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty!");
        } else {
            return arr[front];
        }
    }


    public static void main(String[] args) {
        ArrayCycleQueue queue = new ArrayCycleQueue(3);
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
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入数据：");
                    int i = scanner.nextInt();
                    queue.addQueue(i);
                    break;
                case 'g':
                    try {
                        int queue1 = queue.getQueue();
                        System.out.println("取出的数据是:" + queue1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int queueHead = queue.getQueueHead();
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
