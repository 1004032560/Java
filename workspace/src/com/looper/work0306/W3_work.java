package com.looper.work0306;

import java.util.Scanner;

public class W3_work {

    W3_Calculator calculator = new W3_Calculator();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        W3_Calculator calculator = new W3_Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a的值：");
        int a = scanner.nextInt();
        System.out.print("请输入b的值：");
        int b = scanner.nextInt();

        System.out.println("a+b的结果为："+calculator.add(a,b));
        System.out.println("a-b的结果为："+calculator.sub(a,b));
        System.out.println("a*b的结果为："+calculator.mul(a,b));
        System.out.println("a/b的结果为："+calculator.div(a,b));

    }
}
