package com.looper.work0306;

public class W3_Calculator {

    public int add(int a,int b){

        int result = a + b;

        return result;
    }

    public int sub(int a,int b){

        int result = a - b;

        return result;
    }

    public int mul(int a,int b){

        int result = a * b;

        return result;
    }

    public double div(int a,int b){
        if (b==0){
            System.out.println("b不能为0,错误结果,返回0.0");
            return 0;
        }else {
            double result = a + b;
            return result;
        }
    }

}
