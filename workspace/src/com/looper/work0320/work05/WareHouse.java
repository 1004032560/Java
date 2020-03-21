package com.looper.work0320.work05;

public class WareHouse {

    int cake = 1;

    //生产蛋糕
    public synchronized void product(){
        if (cake==0){
            cake = 1;
            System.out.println(Thread.currentThread().getName()+"制作了一个蛋糕！");
            this.notify();
        }
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    //消费蛋糕
    public synchronized void consume() {
        if (cake==1){
            cake = 0;
            System.out.println(Thread.currentThread().getName()+"取走了一个蛋糕！");
        }else{
            System.out.println("目前没有蛋糕,等待生产！");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

}
