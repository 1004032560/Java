package com.looper.work0304;

public class Work1 {

    public static void main(String[] args) {
        int a=1;
        int b=1;
        int sum=0;
        for (int i=0;i<5;i++){

            a=a+b;
            b=a+b;
        }
        System.out.print(b);
    }

}
