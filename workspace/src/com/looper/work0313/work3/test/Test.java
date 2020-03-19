package com.looper.work0313.work3.test;

import com.looper.work0313.work3.domain.Penguin;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要领养的宠物的名字：");
        String name = sc.next();
        System.out.print("请输入健康值：");
        int health = sc.nextInt();
        System.out.print("请输入亲密度：");
        int love = sc.nextInt();
        Penguin penguin = new Penguin(name, health, love);

        System.out.println("请选择您要领养的企鹅的性别：1.Q仔2.Q妹");
        int choiceSex = sc.nextInt();
        if (choiceSex == 1) {
            penguin.setSex("雄");
        } else if (choiceSex == 2) {
            penguin.setSex("雌");
        } else {
            System.out.println("输入错误");
        }

        System.out.println(penguin.toString());

    }
}

