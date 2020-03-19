package com.looper.work0319.work03;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer("电脑");

        System.out.println("*******************欢迎进入游戏时间********************");
        System.out.println();
        System.out.println("              ************************       ");
        System.out.println("              *      猜拳    开始     *       ");
        System.out.println("              ************************       ");
        System.out.println();
        System.out.println("出拳规则：1.剪刀 2.石头 3.布");
        System.out.print("请输入用户名：");
        Person person = new Person(scanner.next());
        System.out.println(person.getName()+"  VS  "+computer.getName());
        System.out.println();
        System.out.print("要开始吗？(y/n):");
        String str = scanner.next();
        if ("y".equals(str)){
            while(true){
                System.out.print("请出拳：1.剪刀 2.石头 3.布（输入相应的数字）:");
                int num1 = scanner.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println(person.getName() + "出拳: 剪刀");
                        break;
                    case 2:
                        System.out.println(person.getName() + "出拳: 石头");
                        break;
                    case 3:
                        System.out.println(person.getName() + "出拳: 布");
                        break;
                }
                int num2 = computer.showFist();
                if ((num1==1&&num2==3)||(num1==3&&num2==1)||(num1==2&&num2==3)){
                    System.out.println("结果：哇，"+person.getName()+"你好厉害！");
                }else if ((num1==1&&num2==1)||(num1==3&&num2==3)||(num1==2&&num2==2)){
                    System.out.println("结果：哇，"+person.getName()+"我们有心里感应！");
                }else{
                    System.out.println("结果：哈哈，"+person.getName()+"你好菜！");
                }
                System.out.print("要继续吗？(y/n):");
                String str1 = scanner.next();
                if ("n".equals(str1)){
                    break;
                }
            }

        }else{
            System.out.println("退出游戏");
        }
    }
}
