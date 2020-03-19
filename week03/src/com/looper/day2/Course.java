package com.looper.day2;

public abstract class Course {

    protected String name;
    protected int price;

    public Course() {
    }

    public Course(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //价格大于0，可以修改
    /*public void changePrice(int price) {
        if (price>0){
            this.price = price;
        }
    }*/

    //抽象
    public abstract void changePrice(int price);

    //显示信息
    public void show(){
        System.out.println("课程名称:"+name+"价格:"+price);
    }

}
