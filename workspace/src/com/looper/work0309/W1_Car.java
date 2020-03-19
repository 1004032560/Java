package com.looper.work0309;

public class W1_Car extends W1_Vehicle {
    private int loader;

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void show() {
        super.show();
    }

    public void showCar(){
        System.out.println("车轮个数：" + wheels + "个");
        System.out.println("汽车重量：" + weight + "吨");
        System.out.println("载人个数：" + loader + "吨");
    }
}
