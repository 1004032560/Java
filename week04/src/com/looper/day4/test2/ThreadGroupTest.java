package com.looper.day4.test2;

import com.looper.day3.test9.MyRunnable;

public class ThreadGroupTest {

    public static void main(String[] args) {

        System.out.println("主线程执行开始：");

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(new MyRunnable(),"4455");

        ThreadGroup threadGroup = new ThreadGroup("2233");

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行结束1：");

    }

}
