package com.looper.work0310.work1;

public class SalesMan {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saleCar() {
        System.out.println("销售人员：" + name + "销售汽车啦！");
    }

    public void saleCar(String type) {
        System.out.println("销售人员：" + name + "销售了款式：" + type);
    }

    public void saleCar(int id, String type) {
        System.out.println("销售人员：" + name + "销售了款式：" + type + "Id是：" + id);
    }
}
