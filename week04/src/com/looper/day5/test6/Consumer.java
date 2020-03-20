package com.looper.day5.test6;


public class Consumer implements Runnable {

    private WareHouse wareHouse;

    public Consumer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while(true){
            wareHouse.consumeDate();
        }
    }
}

