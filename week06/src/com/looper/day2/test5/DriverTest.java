package com.looper.day2.test5;

public class DriverTest {

    public static void main(String[] args) {

        Driver driver = new BaoMDriver();
        Car car = driver.driverCar();
        BaoM baoM = (BaoM) car;
        System.out.println(baoM);

    }

}
