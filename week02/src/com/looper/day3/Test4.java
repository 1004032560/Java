package com.looper.day3;
public class Test4 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;

        //num1大于8为假，所以&&后边的部分则不会执行；所以num2结果不变
        //最终结果为假
        if (num1 > 8 && num2++ < 2){
            System.out.println("第一次结果是真");
        }
        System.out.println("num1="+num1+";num2="+num2);

        //num1大于4为真，所以&&后边的部分会执行；所以num2的结果会加1
        //最终结果为假
        if (num1 > 4 && num2++ < 2){
            System.out.println("第二次结果是真");
        }
        System.out.println("num1="+num1+";num2="+num2);

        //num1大于4为真，所以&&后边的部分会执行；所以num2的结果会加1
        //最终结果为真
        if (num1 > 4 && num2++ < 5){
            System.out.println("第三次结果是真");
        }
        System.out.println("num1="+num1+";num2="+num2);

    }
}
