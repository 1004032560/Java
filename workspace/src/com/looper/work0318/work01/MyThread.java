package com.looper.work0318.work01;

public class MyThread extends Thread {
    public MyThread(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i=1;i<=200;i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+"奇数有："+i);
            }
            try {
                sleep(1000); //throws不能使用，因为方法重写不能抛出更多（检查异常）异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
