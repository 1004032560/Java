package com.looper.work0309;

public class W1_Truck extends W1_Vehicle {
    private int payload;

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public void showTruck(){
        System.out.println("车轮个数：" + wheels + "个");
        System.out.println("汽车重量：" + weight + "吨");
        System.out.println("载重重量：" + payload + "吨");
    }
}