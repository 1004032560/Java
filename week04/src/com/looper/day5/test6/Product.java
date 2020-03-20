package com.looper.day5.test6;

public class Product implements Runnable {

    private WareHouse wareHouse;

    public Product(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while(true){
            wareHouse.productDate();
        }
    }
}
