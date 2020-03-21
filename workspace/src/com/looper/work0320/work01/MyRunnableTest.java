package com.looper.work0320.work01;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"窗口1");
        Thread thread2 = new Thread(myRunnable,"窗口2");
        Thread thread3 = new Thread(myRunnable,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
