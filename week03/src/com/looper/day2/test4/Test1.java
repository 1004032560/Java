package com.looper.day2.test4;

import java.util.Scanner;

public class Test1 {

    public int fn(int n){
        if (n==1){
            return 1;
        } else{
            //Sn=Sn-1 + n;
            return (fn(n-1)+n);
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();

        Scanner scanner = new Scanner(System.in);

        int res = test.fn(1);
        System.out.println("第1项结果为："+res);

        res = test.fn(2);
        System.out.println("第2项结果为："+res);

        System.out.println("请输入n的项：");
        int n = scanner.nextInt();
        res = test.fn(n);
        System.out.println("第2项结果为："+res);

    }

}
