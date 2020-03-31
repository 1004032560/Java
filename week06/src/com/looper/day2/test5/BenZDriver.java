package com.looper.day2.test5;

public class BenZDriver implements Driver {

    @Override
    public Car driverCar() {
        return new BenZ();
    }

}
