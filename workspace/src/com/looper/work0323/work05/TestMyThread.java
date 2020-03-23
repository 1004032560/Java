package com.looper.work0323.work05;

public class TestMyThread {

    static Object object = new Object();

    public static void main(String[] args) {

        MyThread1 myRunnable1 = new MyThread1();
        MyThread2 myRunnable2 = new MyThread2();

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();

    }

}
