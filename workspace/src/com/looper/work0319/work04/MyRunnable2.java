package com.looper.work0319.work04;

public class MyRunnable2 implements Runnable {

    boolean flag = true;

    @Override
    public void run() {

        while(true) {
            if (flag == false){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"：打印了i一次");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread(){
        flag = false;
    }
}
