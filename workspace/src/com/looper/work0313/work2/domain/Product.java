package com.looper.work0313.work2.domain;

public class Product {
    private int pid;
    private String name;
    private double price;
    private int count;

    public Product() {
    }

    public Product(int pid, String name, double price, int count) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  ("pid=" + pid + ", name=" + name  + ", price=" + price + ", count=" + count );
    }
}
