package com.looper.work0309;

public class W1_HomeWork {

    public static void main(String[] args) {
        System.out.println("小汽车信息：");
        W1_Car car = new W1_Car();
        car.setWheels(4);
        car.setWeight(2);
        car.setLoader(5);
        car.showCar();

        System.out.println("===========");

        System.out.println("大卡车信息：");
        W1_Truck truck = new W1_Truck();
        truck.setWheels(8);
        truck.setWeight(6);
        truck.setPayload(15);;
        truck.showTruck();

    }

}
