package com.looper.day5;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class People {

    private int id;
    private String name;
    private String address;

    public People(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public People(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void think(){
        System.out.println("正在think！");
        System.out.println("正在think！");
    }

    public void work(){
        System.out.println("正在work！");
        System.out.println("正在work！");
    }


}
