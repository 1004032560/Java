package com.looper.work0318.work01;

public class Runnable1 implements java.lang.Runnable {
    @Override
    public void run() {

        for (int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"的i="+i);
            }
        }

    }
}
