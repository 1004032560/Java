package com.looper.work0309;

public class W3_Product {
    private int pid;
    private String pname;
    private double price;
    private int count;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public W3_Product() {
    }

    public W3_Product(int pid, String pname, double price, int count) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.count = count;
    }

    public String show() {
        return "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", count=" + count ;
    }

    public void add(int id,int num){
        if (id==pid){
            count+=num;
        }
    }

    public void out(int id,int num){
        if (id==pid){
            count-=num;
        }
    }
}
