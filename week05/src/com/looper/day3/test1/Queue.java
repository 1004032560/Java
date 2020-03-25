package com.looper.day3.test1;

/**
 * 使用数组模拟队列
 */

public class Queue {

    private int maxSize;
    private int front=0;//队头的索引
    private int rear=-1;//队尾的索引
    private int[] queue;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
    }

    //队列已满的判断
    public boolean isFull(){
        return rear == (maxSize-1);
    }

    //队列为空的判断
    public boolean isEmpty(){
        return front == rear+1;//队头和队尾相等时，队列为空
    }

    //入队
    public void add(int num){
        if (isFull()){
            System.out.println("队列已满");
        }else{
            rear++;
            queue[rear] = num;
        }
    }

    //出队
    public void back(){
        if (isEmpty()){
            System.out.println("队列为空");
        }else{
            //取队头
            System.out.println(queue[front]);
            front++;
        }
    }

    //遍历
    public void list(){
        if (isEmpty()){
            System.out.println("队列为空");
        }else{
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
