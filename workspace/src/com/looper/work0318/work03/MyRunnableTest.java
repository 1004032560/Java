package com.looper.work0318.work03;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1,"张三");
        Thread thread2 = new Thread(myRunnable2,"张三的妻子");

        thread1.start();
        thread2.start();

    }

}
