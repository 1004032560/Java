package com.looper.work0310.work2;

public class Penguin extends Animal {

    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int healthValue, int relationship, String sex) {
        super(name, healthValue, relationship);
        this.sex = sex;
    }

    public Penguin(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void show(){
        System.out.println("这只狗的名字是："+this.name);
        System.out.println("健康值："+this.healthValue);
        System.out.println("亲密度："+this.relationship);
        System.out.println("性别："+this.sex);
    }

}
