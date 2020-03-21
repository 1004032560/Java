package com.looper.work0320.work02;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"抽奖箱1");
        Thread thread2 = new Thread(myRunnable,"抽奖箱2");

        thread1.start();
        thread2.start();

    }

}
