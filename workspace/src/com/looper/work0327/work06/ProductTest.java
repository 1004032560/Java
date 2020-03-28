package com.looper.work0327.work06;

import java.io.*;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("/product.txt");
        loop:while (true){
            System.out.println("******欢迎来到购物商城*******");
            System.out.println("1.录入商品;2.显示所有商品;0.退出.");
            System.out.print("请输入您的选择:");
            int num = sc.nextInt();
            switch (num){
                case 1:{
                    System.out.print("请输入商品编号:");
                    int id = sc.nextInt();
                    System.out.print("请输入商品名称:");
                    String name = sc.next();
                    System.out.print("请输入商品价格:");
                    double price = sc.nextDouble();
                    System.out.print("请输入商品库存:");
                    int count = sc.nextInt();
                    Product product = new Product(id,name,price,count);
                    FileWriter fw = new FileWriter(file,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(product.toString());
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    fw.close();
                    break;
                }
                case 2:{
                    System.out.println("所有商品信息如下：");
                    System.out.println("商品编号\t商品名称\t商品价格\t商品数量");
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String temp = "";
                    while ((temp=br.readLine())!=null){
                        String[] str = temp.split("#");
                        System.out.println(str[0]+"\t"+str[1]+"\t"+str[2]+"\t"+str[3]);
                    }
                    br.close();
                    fr.close();
                    break;
                }
                case 0:{
                    break loop;
                }
            }
        }
    }
}
