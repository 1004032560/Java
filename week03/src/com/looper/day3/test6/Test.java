package com.looper.day3.test6;

public class Test {

    public static void main(String[] args) {

        Fly airPlane = new AirPlane();
        Fly bird = new Bird();

        airPlane.fly();
        bird.fly();
        Bird bird1 = (Bird)bird;
        bird1.run();
        bird1.jump();

    }

}
