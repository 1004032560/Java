package com.looper.day3.test8;

public class MyThreadTest {

    public static void main(String[] args) {

        //创建线程对象
        MyThread myThread1 = new MyThread("线程1");
        //创建线程对象
        MyThread myThread2 = new MyThread("线程2");

        //启动线程
        myThread1.start();
        //启动线程
        myThread2.start();

        //注意不是调用run()方法
        //myThread1.run();
        //myThread2.run();


    }

}
