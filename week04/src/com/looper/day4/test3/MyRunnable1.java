package com.looper.day4.test3;

public class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"执行任务:"+i);
        }
    }
}