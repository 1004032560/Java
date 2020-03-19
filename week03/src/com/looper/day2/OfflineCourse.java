package com.looper.day2;

public class OfflineCourse extends Course {

    private int id;

    public OfflineCourse() {
    }

    public OfflineCourse(String name, int price, int id) {
        super(name, price);
        this.id = id;
    }

    @Override
    public void changePrice(int price) {
        if (price>10000){
            this.price = price;
        }
    }


}
