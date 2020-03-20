package com.looper.day5.test6;

public class Test {

    public static void main(String[] args) {

        //创建仓库对象
        WareHouse wareHouse = new WareHouse();

        //创建生产者线程对象
        Product product = new Product(wareHouse);
        Thread threadProduct = new Thread(product);

        //创建消费者线程对象
        Consumer consumer = new Consumer(wareHouse);
        Thread threadConsumer = new Thread(consumer);

        threadProduct.start();
        threadConsumer.start();

    }

}
