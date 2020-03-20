package com.looper.day6.practice1;

public class SynchronizedTest1 implements Runnable {

    boolean flag = true;

    Object object = new Object();

    int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (object){
                if (ticket!=0){
                    if ("售票员1".equals(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+"：卖出了一张票，剩余票数为："+ticket);
                        ticket--;
                    }else{
                        System.out.println(Thread.currentThread().getName()+"：卖出了一张票，剩余票数为："+ticket);
                        ticket--;
                    }
                }else{
                    System.out.println("目前没有票！");
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
