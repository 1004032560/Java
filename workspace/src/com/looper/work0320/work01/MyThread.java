package com.looper.work0320.work01;

public class MyThread extends Thread {

    static int ticket = 200;

    Object object = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(object){
                if (ticket>=1){
                    if ("窗口1".equals(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+ticket);
                        ticket--;
                    }else if ("窗口2".equals(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+ticket);
                        ticket--;
                    }else{
                        System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数为："+ticket);
                        ticket--;
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
