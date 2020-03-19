package com.looper.work0310.work3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        Food food = new Food();
        Master master = new Master();
        System.out.print("请输入饲养员的名字:");
        Scanner input = new Scanner(System.in);
        String masterName = input.next();
        master.setMasterName(masterName);
        System.out.print("请选择喂养的宠物（1.小狗2.小猫）");
        int num = input.nextInt();
        String petName,type,sex,foodName;
        if(num == 1)
        {
            System.out.print("请输入宠物的名字:");
            petName = input.next();
            System.out.print("请输入狗狗的类型:");
            type = input.next();
            System.out.print("请给出喂养狗狗的食物:");
            foodName = input.next();
            dog.setPetName(petName);
            food.setFoodName(foodName);
            master.feed(dog,food);
        }
        else if(num == 2)
        {
            System.out.print("请输入宠物的名字:");
            petName = input.next();
            System.out.print("请输入猫的性别:");
            sex = input.next();
            System.out.print("请给出喂养猫的食物:");
            foodName = input.next();
            cat.setPetName(petName);
            food.setFoodName(foodName);
            master.feed(cat,food);
        }
    }
}
