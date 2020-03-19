package com.looper.day5.exception;

import java.util.Scanner;

public class MyException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的成绩:");
        int score = scanner.nextInt();

        System.out.println("你输入的成绩为:"+score);

    }

}
