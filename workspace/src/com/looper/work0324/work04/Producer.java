package com.looper.work0324.work04;

public class Producer implements Runnable {

    private WareHouse wareHouse;

    public Producer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {

        while(true){
            wareHouse.product();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
