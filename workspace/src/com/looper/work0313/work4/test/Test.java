package com.looper.work0313.work4.test;

import com.looper.work0313.work4.dao.impl.UserDaoImpl;
import com.looper.work0313.work4.domain.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("------------用户管理系统------------");
            System.out.println("         1.录入用户基本信息");
            System.out.println("         2.查询全部用户信息");
            System.out.println("         3.根据username查询用户");
            System.out.println("         4.根据username修改用户密码");
            System.out.println("         5.退出");
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            if (choice == 1) {
                for (int i = 0; i < userDaoImpl.userLength(); i++) {
                    System.out.print("请输入用户编号：");
                    int uid = sc.nextInt();
                    System.out.print("请输入用户名：");
                    String username = sc.next();
                    System.out.print("请输入密码：");
                    String password = sc.next();
                    System.out.print("请输入用户权限（admin/common）：");
                    String role = sc.next();
                    User user = new User(uid,username,password,role);
                    userDaoImpl.addUser(user);
                }

            } else if (choice == 2) {
                for (User user : userDaoImpl.findAllUsers()) {
                    System.out.println(user);
                }
            } else if (choice == 3) {
                System.out.println("请输入要查找的用户名称");
                String name = sc.next();
                if (userDaoImpl.findUserByUsername(name)!=null){
                    System.out.println("找到用户");
                    System.out.println(userDaoImpl.findUserByUsername(name));
                }else {
                    System.out.println("未找到该用户");
                }
            }else if (choice==4){
                System.out.println("请输入要查找的用户名称");
                String name = sc.next();
                System.out.println("请输入原密码");
                String password = sc.next();
                System.out.println("请输入新密码");
                String newPassword = sc.next();
                boolean flag = userDaoImpl.modifyPasswordByUsername(name,password,newPassword);
                if (flag){
                    System.out.println("修改成功");
                }else {
                    System.out.println("未找到用户");
                }
            }else if (choice==5){
                break;
            }else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}