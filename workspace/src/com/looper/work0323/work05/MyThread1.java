package com.looper.work0323.work05;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (TestMyThread.object){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                TestMyThread.object.notify();
            }
        }
    }
}
