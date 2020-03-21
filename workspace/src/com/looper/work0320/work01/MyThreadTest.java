package com.looper.work0320.work01;

public class MyThreadTest {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(myThread,"窗口1");
        Thread thread2 = new Thread(myThread,"窗口2");
        Thread thread3 = new Thread(myThread,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
