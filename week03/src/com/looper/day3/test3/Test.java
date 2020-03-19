package com.looper.day3.test3;

/**
 * 体现的是：依赖关系
 */

public class Test {

    public static void main(String[] args) {

        Bus bus = new Bus(710);

        Worker worker = new Worker(1001,"张三");

        worker.toWork(bus);

    }

}
