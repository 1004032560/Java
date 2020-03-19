package com.looper.work0319.work04;

public class RunnableTest1 {

    public static void main(String[] args) {

        MyRunnable1 myRunnable1 = new MyRunnable1();

        Thread thread1 = new Thread(myRunnable1,"线程1");

        thread1.start();

        thread1.interrupt();

    }

}
