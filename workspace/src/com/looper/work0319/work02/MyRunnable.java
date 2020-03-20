package com.looper.work0319.work02;

import java.util.Random;

public class MyRunnable implements Runnable {

    boolean[] flags = new boolean[11];

    @Override
    public void run() {

        int[] arr = {10,5,20,50,100,200,500,800,2,80,300};

        Random random = new Random();

        for (int i=0;i<arr.length;i++) {
            //数组索引的随机数
            int num = random.nextInt(arr.length);
            for (int j=0;j<arr.length;j++){
                if (num==j){
                    if (flags[j]==false){

                        if (Thread.currentThread().getName()=="抽奖箱1"){
                            System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[i]+"元大奖");
                        }else{
                            System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[i]+"元大奖");
                        }
                        //更改标志位
                        flags[j] = true;
                    }else{
                        System.out.println(arr[j]+"此奖项以及产生过了！");
                        //浪费了一次机会
                        //i--;
                    }
                }
            }
        }
    }
}
