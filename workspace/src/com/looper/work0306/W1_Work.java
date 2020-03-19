package com.looper.work0306;

import java.util.Scanner;

public class W1_Work {

    public static void main(String[] args) {

        W1_Hero w1Hero1 = new W1_Hero();
        W1_Monster w1Monster = new W1_Monster();

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入英雄的经验值exp：");
        w1Hero1.setExp((scanner.nextInt()));

        System.out.print("请输入英雄的等级leave：");
        w1Hero1.setLeave((scanner.nextInt()));

        System.out.print("请输入英雄的攻击力att：");
        w1Hero1.setAtt((scanner.nextInt()));

        System.out.print("请输入怪物的等级leave：");
        w1Monster.setLeave((scanner.nextInt()));


        w1Monster.setHp(w1Monster.live());

        while (w1Monster.getHp()!=0){
            System.out.println("英雄攻击了一次怪物！");
            w1Monster.setHp(w1Hero1.attach(w1Monster));
            System.out.println("怪物血量为："+ w1Monster.getHp());
            if (w1Monster.getHp()==0){
                w1Hero1.setExp((w1Hero1.getExp()+1000));
                w1Hero1.setLeave((w1Hero1.getLeave()+10));
                System.out.println("怪物已经被消灭！！");
            }
        }

        w1Hero1.attach(w1Monster);

        System.out.println("英雄的经验值为："+ w1Hero1.getExp());
        System.out.println("英雄的生命值为："+ w1Hero1.getLeave());
        System.out.println("英雄的攻击力为："+ w1Hero1.getAtt());

        System.out.println("怪物的血量为："+ w1Monster.getHp());
        System.out.println("怪物的等级为："+ w1Monster.getLeave());


    }

}
