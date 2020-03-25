package com.looper.work0325.work01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Dog> al = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        /*al.add(new Dog("oo","雪纳瑞"));
        al.add(new Dog("yy","拉布拉多"));
        al.add(new Dog("ff","拉布拉多"));
        al.add(new Dog("mm","雪纳瑞"));

        System.out.println("总共有"+al.size()+"条狗");

        System.out.println("分别是：");

        for (Dog dog : al) {
            System.out.println(dog.getName()+"    "+dog.getType());
        }
*/

        loop:while(true){

            System.out.println("1.添加狗狗");
            System.out.println("2.获取狗狗的数量");
            System.out.println("3.打印每一条狗");
            System.out.println("4.删除指位置的狗狗");
            System.out.println("5.根据昵称查找狗狗");
            System.out.println("0.退出");
            System.out.println("=============================");
            System.out.println("请输入选项：");
            int num = scanner.nextInt();

            switch(num){
                case 1:{
                    while(true){
                        System.out.print("请输入狗狗的名字：");
                        String name = scanner.next();
                        System.out.print("请输入狗狗的类型：");
                        String type = scanner.next();
                        al.add(new Dog(name,type));

                        System.out.print("是否继续添加数据：");
                        String next = scanner.next();

                        if ("n".equals(next)){
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("总共有"+al.size()+"条狗");
                    break;
                }
                case 3:{
                    System.out.println("分别是：");
                    for (Dog dog : al) {
                        System.out.println(dog.getName()+"    "+dog.getType());
                    }
                    break;
                }
                case 4:{
                    System.out.print("请输入删除第几个狗狗：");
                    int num1 = scanner.nextInt();
                    al.remove(num1);
                    for (Dog dog : al) {
                        System.out.println(dog.getName()+"    "+dog.getType());
                    }
                    System.out.println("删除成功");
                    break;
                }
                case 5:{
                    System.out.print("请输入查找的狗狗昵称：");
                    String name1 = scanner.next();
                    System.out.println(al.contains(name1));
                    break;
                }
                case 0:{
                    break loop;
                }
            }
        }


    }

}
