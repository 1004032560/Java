package com.looper.work0303;

import java.util.Scanner;

/**
 * 读入一个表示年份的整数，判断这一年是否是闰年。如何判断 一个年份是否是闰年：
 * 1）如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例 如，1996 年是闰年，而相应的，1993 年就不是闰年。
 * 2） 如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰 年。例如，2000 年是闰年，1900 年不是闰年。
 */

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        if (year<0){
            System.out.println("年份有误");
        }

        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }

    }


}
