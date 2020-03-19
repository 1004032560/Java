package com.looper.work0303;

import com.sun.xml.internal.ws.api.message.Header;

import java.util.Scanner;

/**
 * 开发购物系统菜单
 * 需求说明
 *      在控制台输出购物系统登录菜单
 *      当用户选择1时在控制台输出系统主菜单
 *      当用户选择2时在控制台输出退出成功
 */

public class Work2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Work2 w4 = new Work2();
        w4.SingIn();

        System.out.print("请选择，输入数字：");
        int num = scanner.nextInt();

        if (num==1){
            w4.User();

            System.out.print("请选择，输入数字(目前只有4可供选择)：");
            int num1 = scanner.nextInt();

            if (num1==4){
                w4.SignOut();
            }

        }else{
            w4.SignOut();
        }
    }

    //用户界面
    public void User(){
        Work2 w2 = new Work2();
        w2.Blank();
        w2.Header();
        w2.Blank();
        w2.Footer();
        w2.Blank();
        System.out.println("                       1.客户信息管理");
        System.out.println("                       2.购物结算");
        System.out.println("                       3.真情回馈");
        System.out.println("                       4.注销");
        w2.Blank();
        w2.Footer();
        w2.Blank();
    }

    //登录页面
    public void SingIn(){
        Work2 w3 = new Work2();
        w3.Blank();
        w3.Header();
        w3.Blank();
        System.out.println("                       1.登录系统");
        w3.Blank();
        System.out.println("                       2.  退出");
        w3.Blank();
        w3.Footer();
        w3.Blank();
    }

    //退出页面
    public void SignOut(){
        Work2 w1 = new Work2();
        w1.Blank();
        w1.Header();
        w1.Blank();
        w1.Footer();
        w1.Blank();
        w1.Blank();
        System.out.println("                         退出成功！");
        w1.Blank();
        w1.Blank();
        w1.Footer();
    }

    //头部
    public void Header(){
        System.out.println("                  欢迎使用我行管理系统");
    }

    //空间隔行
    public void Blank(){
        System.out.println();
    }

    //底部
    public void Footer(){
        System.out.println("**********************************************************");
    }

}
