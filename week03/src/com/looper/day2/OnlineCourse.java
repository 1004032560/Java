package com.looper.day2;

public class OnlineCourse extends Course {

    private int leave;

    public OnlineCourse() {
    }

    public OnlineCourse(String name, int price, int leave) {
        super(name, price);
        this.leave = leave;
    }

    @Override
    public void changePrice(int price) {
        if (price>5000){
            this.price = price;
        }
    }
}
