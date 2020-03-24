package com.looper.day2.test1;

public enum Signal {

    RED("红灯",1),GREEN("绿灯",2),YELLOW("黄灯",3);
    private String name;
    private int id;

    Signal(String name, int id) {
        this.name = name;
        this.id = id;
    }



}

