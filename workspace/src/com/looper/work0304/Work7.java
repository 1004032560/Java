package com.looper.work0304;

public class Work7 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i=1;i<100;i++){

            if (i%3!=0){

                sum = sum + i;

            }

        }

        System.out.println(sum);

    }

}
