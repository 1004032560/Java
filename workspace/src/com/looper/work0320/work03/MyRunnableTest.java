package com.looper.work0320.work03;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"张三");
        Thread thread2 = new Thread(myRunnable,"张三的妻子");

        thread1.start();
        thread2.start();

    }

}
