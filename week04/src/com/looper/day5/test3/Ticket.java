package com.looper.day5.test3;

public class Ticket implements Runnable {

    private int count = 100;

    static Object object = new Object();

    @Override
    public synchronized void run() {
        while(true){
            if (count>=1){
                System.out.println(Thread.currentThread().getName()+"：出售第"+count+"张票");
                count--;
                //放慢速度，模拟真实环境
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //System.out.println("票已经被出售完了");
                break;
            }
        }
    }
}
