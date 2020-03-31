package com.looper.day2.test5;

public class BaoMDriver implements Driver {

    @Override
    public Car driverCar() {
        return new BaoM();
    }
}
