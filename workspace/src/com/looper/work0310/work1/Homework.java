package com.looper.work0310.work1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Car car = new Car();
        SalesMan salesMan = new SalesMan();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入销售人员的姓名：");
        String name = input.next();
        salesMan.setName(name);
        System.out.println("1.按数量销售 2.按数量和款式销售 3.按具体车对象销售");
        System.out.print("请输入销售方式：");
        int num = input.nextInt();
        String type;
        int id;
        if(num == 1)
        {
            salesMan.saleCar();
        }
        else if(num == 2)
        {
            System.out.print("请输入款式：");
            type = input.next();
            salesMan.saleCar(type);
        }
        else if(num == 3){
            System.out.print("请输入销售的汽车款式：");
            type = input.next();
            System.out.print("请输入销售的汽车编号：");
            id  = input.nextInt();
            salesMan.saleCar(id,type);
        }
    }
}
