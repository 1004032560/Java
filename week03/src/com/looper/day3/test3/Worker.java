package com.looper.day3.test3;

public class Worker {

    private int id;
    private String name;

    public Worker() {
    }

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public void toWork(Bus bus){
        System.out.println(name+"上班，乘坐编号为"+bus.getId());
    }

}
