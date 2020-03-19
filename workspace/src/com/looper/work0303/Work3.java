package com.looper.work0303;

/**
 * 实现购物结算
 * 训练要点
 *      运算符（*、=）的使用
 *      从控制台输入和输出信息
 *      需求说明
 *      用户可以享受购物8折的优惠，请计算实际消费金额
 *      提示： *表示乘法
 */

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的姓名：");
        String name = scanner.nextLine();
        System.out.println(name + "欢迎您的光临！");

        System.out.print("请输入您的消费金额：");
        double price = scanner.nextDouble();
        System.out.println("您是本店会员，为你打8折，折后您应付的总金额是："+(price*0.8));

    }

}
