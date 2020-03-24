package com.looper.day2.test1;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight tl = new  TrafficLight(Signal.RED);
        // TrafficLight tl = new  TrafficLight("hello");//编译不通过，比较安全

        tl.change();
        tl.change();
        tl.change();
    }

}
