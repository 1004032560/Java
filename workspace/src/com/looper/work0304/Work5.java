package com.looper.work0304;

import java.util.Scanner;

public class Work5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        int length = 0;

        if (num==0){
            length++;
            System.out.print("逆序输出为:0");
            System.out.println("长度为:"+length);
        }else{
            System.out.println("逆序输出为:");
            while (num!=0){
                length++;
                System.out.print(num%10);
                num/=10;
            }
            System.out.println("长度为:"+length);
        }

    }
}

