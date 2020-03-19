package com.looper.work0303;

import java.util.Scanner;

/**
 * 实现加减运算
 * 训练要点
 *      运算符（+、-、=）的使用
 *      从控制台输出信息
 */

public class Work1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入num1：");
        int num1 = scanner.nextInt();

        System.out.print("请输入num2：");
        int num2 = scanner.nextInt();

        System.out.println("两数之和是："+(num1+num2));
        System.out.println("num1+num2="+(num1+num2));
        System.out.println("两数之差是："+(num1-num2));
        System.out.println("num1-num2="+(num1-num2));

    }

}
