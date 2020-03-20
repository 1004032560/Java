package com.looper.day5.test6;

public class WareHouse {
    //假设库存是1个产品
    private int count = 0;

    //生产数据
    public synchronized void productDate(){
        if(count==0){
            System.out.println("生产一个产品");
            count=1;
            //唤醒消费者
            this.notify();
        }
    }

    //消费数据
    public synchronized void consumeDate(){
        if(count==0){
            System.out.println("等待生产！");
            //等待生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("消费了一个产品..");
            count=0;
        }
    }
}
