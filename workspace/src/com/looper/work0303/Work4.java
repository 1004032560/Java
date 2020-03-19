package com.looper.work0303;

import java.util.Scanner;

/**
 * 实现根据用户输入成绩判断级别功能
 */

public class Work4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的成绩：");
        int num = scanner.nextInt();

        if(num>90){
            System.out.println("优秀");
        }else if(num<=90&&num>70){
            System.out.println("良好");
        }else if(num<=70&&num>=60){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }

    }

}
