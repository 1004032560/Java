package com.looper.work0320.work05;


public class Consumer implements Runnable {

    private WareHouse wareHouse;

    public Consumer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while(true){
            wareHouse.consume();
        }
    }
}