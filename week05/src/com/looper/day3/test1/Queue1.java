package com.looper.day3.test1;

public class Queue1 {
    private int maxSize;
    private int front = 0;//队头的索引位置
    private int rear = -1;//队尾的索引位置
    private int[] queue;

    public Queue1(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    //队空的方法
    public boolean isEmpty() {
        return front == rear;
    }

    //队满的方法
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //入队
    public void addQueue(int num) {
        if (isFull()) {
            System.out.println("队已经满了，无法完成入队操作！");
        } else {
            //队尾向后移动
            rear++;
            queue[rear] = num;
        }
    }

    //出队
    public int getQueue() {
        if (isEmpty()) {
            System.out.println("队为空，无法获取数据！");
            throw new RuntimeException();
        } else {
            //队头向后移动
            int num = queue[front];
            front++;
            return num;
        }
    }

    //遍历队
    public void list() {
        if (isEmpty()) {
            System.out.println("队为空，没有要显示的数据！");
        } else {
            //遍历数据，从队头到队尾
            //System.out.println(front);
            // System.out.println(rear);
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}