package com.looper.work0324.work04;

public class WareHouse {

    private int count = 0;

    public synchronized void product(){

        if (count <= 0) {
            while(count <= 5){
                System.out.println("生产者生产产品,产品数:"+count);
                count++;
            }
            //唤醒消费者
            this.notify();
        }

    }

    public synchronized void custom() {

        if (count > 0) {

            while(count > 0){
                System.out.println("消费者消费产品,剩余:"+count);
                count--;
            }
            //等待生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
