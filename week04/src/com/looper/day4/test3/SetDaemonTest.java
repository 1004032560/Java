package com.looper.day4.test3;

import com.looper.day3.test9.MyRunnable;

public class SetDaemonTest {

    public static void main(String[] args) {

        MyRunnable myRunnable= new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"线程1");

        MyRunnable1 myRunnable1= new MyRunnable1();
        Thread thread2 = new Thread(myRunnable1,"线程2");

        //设置成后台线程
        thread1.setDaemon(true);

        //设置成后台线程之后，用户线程结束，后台线程也会随之结束

        thread1.start();
        thread2.start();

    }

}
