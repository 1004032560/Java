package com.looper.work0309;

import java.util.Scanner;

public class W3_HomeWork {
    public static void main(String[] args) {
        W3_Product[] pl = new W3_Product[3];
        W3_Product p = new W3_Product();
        Scanner sc =new Scanner(System.in);
        int num = 0;
        String name = " ";
        int price = 0;
        int count = 0;

        loop:while (true){
            System.out.println("**********欢迎来到购物商城**********");
            System.out.println("1.录入商品 2.显示商品 3.入库 4.出库 5.退出 ");
            System.out.println("请输入您的选择：");
            num = sc.nextInt();
            switch (num){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        W3_Product w3Product = new W3_Product();
                        System.out.println("请输入第" + (i + 1) + "个商品编号：");
                        w3Product.setPid(sc.nextInt());
                        System.out.println("请输入商品名称：");
                        w3Product.setPname(sc.next());
                        System.out.println("请输入商品价格：");
                        w3Product.setPrice(sc.nextDouble());
                        System.out.println("请输入商品数量：");
                        w3Product.setCount(sc.nextInt());
                        pl[i] = w3Product;
                    }
                    break;
                case 2:
                    System.out.println("编号\t名称\t价格\t数量");
                    for (int i = 0; i < pl.length; i++) {
                        System.out.println(pl[i].show());
                    }
                    break;
                case 3:
                    System.out.println("请输入要入库的商品编号");
                    num = sc.nextInt();
                    System.out.println("请输入要入库的商品数量");
                    count = sc.nextInt();
                    for (W3_Product w3Product :pl){
                        w3Product.add(num,count);
                    }
                    break;
                case 4:
                    System.out.println("请输入要出库的商品编号");
                    num = sc.nextInt();
                    System.out.println("请输入要出库的商品数量");
                    count = sc.nextInt();
                    for (W3_Product w3Product :pl){
                        w3Product.out(num,count);
                    }
                    break;
                case 5:
                    break loop;
            }
        }

    }
}
