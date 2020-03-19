package com.looper.work0310.work2;

public class Dog extends Animal {

    private String type;

    public Dog() {
    }

    public Dog(String name, int healthValue, int relationship, String type) {
        super(name, healthValue, relationship);
        this.type = type;
    }

    public Dog(String type) {
        this.type = type;
    }

    @Override
    public void show(){
        System.out.println("这只狗的名字是："+this.name);
        System.out.println("健康值："+this.healthValue);
        System.out.println("亲密度："+this.relationship);
        System.out.println("品种："+this.type);
    }

}
