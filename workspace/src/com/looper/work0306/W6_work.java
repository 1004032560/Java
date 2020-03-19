package com.looper.work0306;

import java.util.Scanner;

public class W6_work {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入管理员姓名：");
        String adminName = scanner.next();

        System.out.print("请输入管理员密码：");
        int adminPassword = scanner.nextInt();

        System.out.print("请输入用户姓名：");
        String userName = scanner.next();

        System.out.print("请输入用户密码：");
        String userPassword = scanner.next();

        System.out.print("请输入用户卡类型：");
        String userCard = scanner.next();

        System.out.print("请输入用户积分：");
        int userIntegral = scanner.nextInt();

        W6_Customer customer = new W6_Customer(userName,userPassword,userIntegral,userCard);

        W6_Administrator administrator = new W6_Administrator(adminName,adminPassword);



        loop1:while (true){

            System.out.println("*************************");

            System.out.print("请输入管理员姓名：");
            String name = scanner.next();

            System.out.print("请输入管理员密码：");
            int password = scanner.nextInt();

            if (administrator.login(name,password)){

                System.out.println("登录成功！！");

                loop2:while (true){
                    System.out.println("*************************");
                    System.out.println("1.查看管理员信息");
                    System.out.println("2.查看顾客员信息");
                    System.out.println("3.修改管理员信息");
                    System.out.println("4.退出");
                    System.out.print("请输入选择：");
                    int num = scanner.nextInt();
                    loop3:switch (num){
                        case 1:{
                            administrator.show();
                            break;
                        }
                        case 2:{
                            customer.show();
                            break;
                        }
                        case 3:{
                            administrator.reNamePassword();
                            break;
                        }
                        case 4:{
                            System.out.println("是否退出程序y/n：");
                            String str = scanner.next();
                            if ("y".equals(str)){
                                System.out.println("退出成功！");
                                break loop1;
                            }
                        }
                    }
                }
            }else{
                System.out.println("管理员用户名或者密码错误！！");
            }
        }

    }

}
