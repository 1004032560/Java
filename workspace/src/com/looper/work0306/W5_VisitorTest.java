package com.looper.work0306;

import java.util.Scanner;

public class W5_VisitorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入姓名：");

        String name = scanner.next();

        System.out.print("请输入年龄：");

        int age = scanner.nextInt();

        W5_Visitor visitor = new W5_Visitor(name,age);

        visitor.judgePrice();

    }

}
