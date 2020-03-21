package com.looper.work0320.work05;

public class Test {

    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse();

        Producer producer = new Producer(wareHouse);
        Consumer consumer = new Consumer(wareHouse);

        Thread thread1 = new Thread(producer,"生产者：");
        Thread thread2 = new Thread(consumer,"消费者：");

        thread1.start();
        thread2.start();

    }

}
