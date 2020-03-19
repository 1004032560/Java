package com.looper.work0306;

import java.util.Scanner;

public class W2_Work {

    public static void main(String[] args) {

        W2_Hero2 hero21 = new W2_Hero2();
        W2_Hero2 hero22 = new W2_Hero2(2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入英雄1的等级：");

        int leave = scanner.nextInt();

        hero21.setLeave(leave);

        hero21.setExp(hero21.calculateExp());
        hero22.setExp(hero22.calculateExp());

/*        System.out.print("请输入英雄1的经验：");

        int exp = scanner.nextInt();

        hero21.setExp(exp);*/

        System.out.println("英雄1的等级为："+hero21.getLeave());

        System.out.println("英雄1的经验为："+hero21.getExp());

        System.out.println("英雄2的等级为："+hero22.getLeave());

        System.out.println("英雄2的经验为："+hero22.getExp());


    }

}
