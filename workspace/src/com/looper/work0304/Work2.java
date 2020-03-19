package com.looper.work0304;

public class Work2 {

    public static void main(String[] args) {

        int count = 0;
        boolean sign = true;

        for (int i=11;i<105;i++){

            if(i % 2 == 0){
                continue;
            }

            for (int j=2;j<i;j++){
                if ((i%j)==0){
                    sign=false;
                    break;
                }
            }

            if (sign){
                count++;
            }

            sign = true;

        }
        System.out.println(count);

    }

}
