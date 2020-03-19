package com.looper.work0304;

import java.util.Scanner;

public class Work10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("**********欢迎来到购物商场用户登录界面**********");
            System.out.print("请输入你的用户名：");
            String username = sc.next();
            System.out.print("请输入你的密码：");
            String password = sc.next();
            if ("张三".equals(username)){
                if ("123456".equals(password)){
                    System.out.println("登录成功！");
                    break;
                }else{
                    System.out.println("用户名或者密码错误！");
                }
            }else{
                System.out.println("用户名或者密码错误！");
            }
        }
    }
}
