package com.looper.work0320.work01;

public class MyRunnable implements Runnable {

    Object obj = new Object();

    int count = 200;

    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if (count>=1){
                    if ("窗口1".equals(Thread.currentThread().getName())){
                        count--;
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+count);
                    }else if ("窗口2".equals(Thread.currentThread().getName())){
                        count--;
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+count);
                    }else{
                        count--;
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+count);
                    }
                }else{
                    System.out.println("票已经售完！");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
