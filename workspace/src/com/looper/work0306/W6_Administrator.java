package com.looper.work0306;

import java.util.Scanner;

public class W6_Administrator {

    private String username;
    private int password;

    public W6_Administrator(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void show(){
        System.out.println("************欢迎进入管理员页面*************");
        System.out.println("管理员姓名；"+username);
        System.out.println("管理员密码："+password);
    }

    public boolean login(String adminName, int adminPassword){
        if (username.equals(adminName) && password==adminPassword){
            return true;
        }else{
            return false;
        }
    }

    public void reNamePassword(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true){
            System.out.println("请输入新密码：");
            int newPassword = scanner.nextInt();

            System.out.println("请再次输入新密码：");
            int newTwoPassword = scanner.nextInt();

                if (newPassword!=newTwoPassword){
                    System.out.println("两次密码不一致请重新输入！");
                    count++;
                }else{
                    System.out.println("密码修改成功！");
                    break;
                }

                if (count==3){
                    System.out.println("输入次数超过三次，自动退出");
                    break;
                }
            }

    }

}
