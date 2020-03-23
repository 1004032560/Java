package com.looper.work0323.work05;

public class MyThread2 implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 100; i >= 0; i--) {
            synchronized (TestMyThread.object){
                System.out.println(i);
                try {
                    TestMyThread.object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
