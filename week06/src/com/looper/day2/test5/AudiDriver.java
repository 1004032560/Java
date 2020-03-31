package com.looper.day2.test5;

public class AudiDriver implements Driver {

    @Override
    public Car driverCar() {
        return new Audi();
    }
}