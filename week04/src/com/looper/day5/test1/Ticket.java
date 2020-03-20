package com.looper.day5.test1;

public class Ticket implements Runnable {

    private int count = 100;

    @Override
    public void run() {
        while(true){
            if (count>=1){
                System.out.println(Thread.currentThread().getName()+"：出售第"+count+"张票");
                count--;
            }else{
                System.out.println("票已经被出售完了");
                break;
            }

        }
    }
}
