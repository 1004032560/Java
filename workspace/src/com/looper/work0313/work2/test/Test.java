package com.looper.work0313.work2.test;

import com.looper.work0313.work2.domain.Product;
import com.looper.work0313.work2.exception.MyException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product(1001, "手机", 2000, 500);
        products[1] = new Product(1002, "电视", 1000, 100);
        products[2] = new Product(1003, "电脑", 5000, 300);


        System.out.println("========================家电购物系统=====================");
        System.out.println("编号       商品名称       价格       数量");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要购买的商品的编号：");
        int pid = sc.nextInt();
        System.out.println("输入要购买的数量");
        int num = sc.nextInt();

        int flag = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPid() == pid) {
                flag = i;
                break;
            }
        }

        try {
            if (flag == -1 || products[flag].getCount() == 0) {
                throw new MyException("未找到该商品!!!");
            } else if (products[flag].getCount() - num < 0) {
                throw new MyException("找到该商品,但是商品库存不足!!!");
            } else {
                products[flag].setCount(products[flag].getCount() - num);
            }
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("========================家电购物系统=====================");
            System.out.println("编号       商品名称       价格       数量");
            for (Product product : products) {
                System.out.println(product.toString());
            }
        }

    }
}
