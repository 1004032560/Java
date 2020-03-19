package com.looper;

public class Calculator {

    public void add(int ... nums){
        for (int num : nums){
            System.out.println(num);
        }

    }

}
