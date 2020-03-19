package com.looper.day3;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println(" 欢迎来到我行我素购物管理系统");
            System.out.println("******************************");
            System.out.println("            1.客户");
            System.out.println("            2.结算");
            System.out.println("            3.回馈");
            System.out.println("            4.注销");
            System.out.println("******************************");
            System.out.print("请输入你的选择：");
            String str = sc.next();

            if ("1".equals(str)){
                System.out.println("执行客户操作");
                break;
            }else if ("2".equals(str)){
                System.out.println("执行结算操作");
                break;
            }else if ("3".equals(str)){
                System.out.println("执行回馈操作");
                break;
            }else if ("4".equals(str)){
                System.out.println("执行注销操作");
                break;
            }else{
                System.out.println("输入有误，请重新输入");
            }
        }
    }
}
