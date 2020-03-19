package com.looper.day3.test9;

public class MyRunnableTest {

    public static void main(String[] args) {

        //创建Runnable对象
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        //创建线程对象
        Thread thread1 = new Thread(myRunnable1,"线程1");
        Thread thread2 = new Thread(myRunnable2);

        //启动线程
        thread1.start();
        thread2.start();

    }

}
