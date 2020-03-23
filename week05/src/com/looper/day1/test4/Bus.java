package com.looper.day1.test4;

public class Bus {

    private String id;
    private String name;

    public Bus(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bus() {
    }

    public<T> void goToWork(T t){

        System.out.println("乘坐"+t);

    }
}
