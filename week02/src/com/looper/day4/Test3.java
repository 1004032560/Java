package com.looper.day4;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = scanner.nextInt();
        int a = num%10;
        int b = num/10%10;
        int c = num/100;
        if (num==(a*a*a+b*b*b+c*c*c)){
            System.out.println(num+"是水仙花数");
        }else{
            System.out.println(num+"不是水仙花数");
        }
    }
}

