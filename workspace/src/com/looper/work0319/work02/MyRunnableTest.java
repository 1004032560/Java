package com.looper.work0319.work02;

public class MyRunnableTest {

    public static void main(String[] args) {

        //MyRunnable myRunnable1 = new MyRunnable();
        //MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(new MyRunnable(),"抽奖箱1");
        Thread thread2 = new Thread(new MyRunnable(),"抽奖箱2");

        thread1.start();
        thread2.start();

    }

}
