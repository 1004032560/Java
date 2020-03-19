package com.looper.work0309;

public class W1_Vehicle {
    protected int wheels;
    protected int weight;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show(){
        System.out.println("车轮个数：" + wheels + "汽车重量" + weight);
    }
}
