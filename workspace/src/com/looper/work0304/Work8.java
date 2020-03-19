package com.looper.work0304;

import java.util.Scanner;

public class Work8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("上午阅读，下午编程。。。");
            System.out.println("我合格了么？(y/n)");
            String str = sc.next();
            if ("y".equals(str)){
                System.out.println("学生解放了！");
                break;
            }

        }

    }

}
