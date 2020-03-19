package com.looper.work0309;

public class W2_HomeWork {
    public static void main(String[] args) {
        W2_Fly w2Fly = new W2_Fly();
        W2_Bird w2Bird = new W2_Bird();
        W2_Plane w2Plane = new W2_Plane();

        System.out.println("Fly的fly方法：");
        w2Fly.fly();
        System.out.println("Bird的fly方法：");
        w2Bird.fly();
        System.out.println("Plane的fly方法：");
        w2Plane.fly();
    }
}
