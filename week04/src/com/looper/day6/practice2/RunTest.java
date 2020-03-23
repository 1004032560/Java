package com.looper.day6.practice2;

/**
 *
 */

public class RunTest {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable(),"测试");

        thread.start();//非主线；在第一并不是第一个执行

        thread.run();//主线程

        System.out.println("main!");//主线程

    }

}
