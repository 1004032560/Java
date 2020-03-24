package com.looper.day2.test1;

public enum SignalLight {

    RED("红灯","停"),GREEN("绿灯","行"),YELLOW("黄灯","等一等");

    private String name;
    private String value;

    SignalLight(String name, String value) {
    }
}
