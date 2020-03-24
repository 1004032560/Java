package com.looper.work0324.work04;

public class Test {

    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse();

        Customer customer = new Customer(wareHouse);
        Producer producer = new Producer(wareHouse);

        Thread thread1 = new Thread(customer);
        Thread thread2 = new Thread(producer);

        thread1.start();
        thread2.start();

    }

}
