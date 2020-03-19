package com.looper.work0304;

import java.util.Scanner;

public class Work9 {

    public static void main(String[] args) {

        int price1 = 260;
        int price2 = 200;
        int price3 = 150;

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("欢迎来到我行我素购物系统");
            System.out.println("1.T恤  2.网球鞋  3.牛仔裤");
            System.out.print("请输入要购买的商品编号：");
            String str = sc.next();
            System.out.print("请输入要购买的商品数量：");
            int num = sc.nextInt();

            if ("1".equals(str)){
                System.out.println("1.T恤   ￥"+price1+"  数量："+num+"  此次选择商品的合计："+(price1*num));
                sum += (price1*num);
                System.out.println("是否继续购买(y/n)");
                String str1 = sc.next();
                if ("n".equals(str1)) {
                    break;
                }
            }else if ("2".equals(str)){
                System.out.println("2.网球鞋  ￥"+price2+"  数量："+num+"  此次选择商品的合计："+(price2*num));
                sum += (price2*num);
                System.out.println("是否继续购买(y/n)");
                String str1 = sc.next();
                if ("n".equals(str1)) {
                    break;
                }
            }else if ("3".equals(str)){
                System.out.println("3.牛仔裤  ￥"+price3+"  数量："+num+"  此次选择商品的合计："+(price3*num));
                sum += (price3*num);
                System.out.println("是否继续购买(y/n)");
                String str1 = sc.next();
                if ("n".equals(str1)) {
                    break;
                }
            }

        }

        System.out.println("消费总金额："+sum);
        System.out.println("程序结束");

    }

}
