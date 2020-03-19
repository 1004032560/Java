package com.looper.work0306;

import java.util.Scanner;

public class W7_ScoreCalcTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入C语言成绩：");
        int c = scanner.nextInt();

        System.out.print("请输入java语言成绩：");
        int java = scanner.nextInt();

        System.out.print("请输入vb语言成绩：");
        int vb = scanner.nextInt();

        W7_ScoreCalc scoreCalc = new W7_ScoreCalc(c,java,vb);

        System.out.println("总分数是："+scoreCalc.add());
        System.out.println("平均分数是："+scoreCalc.avg());

    }

}
