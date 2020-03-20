package com.looper.day6.practice1;

public class SynchronizedTest2 implements Runnable {

    int ticket = 100;

    @Override
    public synchronized void run() {
        while(true){

            if (ticket>0){
                if ("售票员1".equals(Thread.currentThread().getName())){
                    System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数："+ticket);
                    ticket--;
                }else{
                    System.out.println(Thread.currentThread().getName()+"：售出一张票，剩余票数："+ticket);
                    ticket--;
                }
            }else{
                System.out.println("票已经售完！");
                break;
            }
        }
    }
}
