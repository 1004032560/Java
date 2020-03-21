package com.looper.work0320.work04;

public class MyRunnableTest {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"线程1");

        Thread thread2 = new Thread(myRunnable,"线程2");

        //thread1.setPriority(5);
        //thread2.setPriority(8);

        thread1.start();
        thread2.start();

    }

}
