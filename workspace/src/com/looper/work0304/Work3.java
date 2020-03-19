package com.looper.work0304;

public class Work3 {

    public static void main(String[] args) {

        for (int i=100;i<=500;i++){

            int a = i%10;

            int b = i/10%10;

            int c = i/100;

            if ((a*a*a+b*b*b+c*c*c) == i){
                System.out.println(i+"是水仙花数");
            }

        }

    }

}
