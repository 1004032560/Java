package com.looper.day1.test4;

public class Car {

    private String id;
    private String type;

    public Car(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
