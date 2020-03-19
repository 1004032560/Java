package com.looper.work0318.work01;

public class MyThreadTest {

    public static void main(String[] args) {

        //创建线程对象
        MyThread myThread = new MyThread("奇数正输出：");
        MyRunnable myRunnable = new MyRunnable();

        //转换
        Thread threadMyRunnable = new Thread(myRunnable,"奇数逆输出：");

        //启动线程
        myThread.start();
        threadMyRunnable.start();


    }

}
