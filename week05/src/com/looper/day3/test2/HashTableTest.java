package com.looper.day3.test2;

import java.util.Scanner;

public class HashTableTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashTable hashTable = new HashTable(5);

        while(true) {
            System.out.println("1.添加雇员2.显示雇员3.根据id查看某雇员0.退出");
            System.out.print("请输入您的选择：");
            int sel = input.nextInt();
            if(sel==1){
                System.out.print("请输入要添加的员工编号：");
                int id = input.nextInt();
                System.out.print("请输入要添加的员工姓名：");
                String name = input.next();
                Emp emp = new Emp(id,name);
                hashTable.add(emp);
            }else if(sel==2){
                hashTable.list();
            }else if(sel==3){
                System.out.print("请输入要查找的员工编号：");
                int id = input.nextInt();
                Emp emp = hashTable.findEmpById(id);
                System.out.println("查找的结果："+emp);
            }else if (sel == 0) {
                System.out.println("退出成功！");
                break;
            }
        }

    }

}

