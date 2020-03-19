package com.looper.day3.test9;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"执行任务:"+i);
            Thread.yield();
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
