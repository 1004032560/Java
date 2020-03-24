package com.looper.work0324.work04;

public class Customer implements Runnable {

    private WareHouse wareHouse;

    public Customer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while (true){
            wareHouse.custom();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
