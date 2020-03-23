package com.looper.day6.practice2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }
        //System.out.println("Run！");
    }
}
