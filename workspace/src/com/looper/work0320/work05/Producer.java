package com.looper.work0320.work05;

public class Producer implements Runnable {

    private WareHouse wareHouse;

    public Producer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while (true){
            wareHouse.product();
        }
    }
}
