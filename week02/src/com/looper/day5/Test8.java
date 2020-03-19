package com.looper.day5;

public class Test8 {

    public static void main(String[] args) {

        People people1 = new People();
        People people2 = new People(456,"jkl","三单元五楼");

        System.out.println("---------------------");
        System.out.println("---------------------");
        people1.setId(123);
        people1.setName("abc");
        people1.setAddress("三单元四楼");
        System.out.println("ID是"+people1.getId()+"的人叫做"+people1.getName()+"住在"+people1.getAddress());
        people1.think();
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("ID是"+people2.getId()+"的人叫做"+people2.getName()+"住在"+people2.getAddress());
        people2.work();
        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println(people1.toString());

    }

}