package com.looper.work0318.work02;

import java.util.Random;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        int[] arr = {10,5,20,50,100,200,500,800,2,80,300};

        Random random = new Random();

        for (int i=0;i<arr.length;i++) {
            int num = random.nextInt(arr.length+1);
            if (num==i){
                if (Thread.currentThread().getName()=="抽奖箱1"){
                    System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[i]+"元大奖");
                }else{
                    System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[i]+"元大奖");
                }
            }
        }
    }
}
