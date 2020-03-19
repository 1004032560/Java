package com.looper.work0304;

public class Work4 {

    public static void main(String[] args) {

        for (int i=1;i<=100;i++){
            int sum = 0;
            for (int j=1;j<i/2+1;j++){

                if (i%j==0){
                    sum+=j;
                }

                if (sum==i){
                    System.out.println(i+"是完全数");
                }
            }

        }

    }

}
