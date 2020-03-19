package com.looper.work0319.work04;

public class MyRunnable1 implements Runnable {

    boolean flag = true;

    @Override
    public void run() {

        while(flag) {
            System.out.println(Thread.currentThread().getName()+"：打印了i一次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                flag = false;
            }
        }
    }

}
