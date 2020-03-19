package com.looper.work0319.work04;

/**
 * 1. 线程停止的两种方式
 * Interrupt和标志位
 */

public class RunnableTest2 {

    public static void main(String[] args) {

        MyRunnable2 myRunnable2 = new MyRunnable2();

        Thread thread2 = new Thread(myRunnable2,"线程2");

        thread2.start();

        myRunnable2.stopThread();

    }

}
