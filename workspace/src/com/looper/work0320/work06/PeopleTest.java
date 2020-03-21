package com.looper.work0320.work06;

public class PeopleTest {

    public static void main(String[] args) {

        People people1 = new People(123,"张三",18,"",120,"");
        People people2 = new People(123,"李四",18,"",120,"");

        if (people1.hashCode()==people2.hashCode()){
            if (people1.equals(people2)){
                System.out.println("是同一个人");
            }else{
                System.out.println("不是同一个人");
            }
        }else{
            System.out.println("不是同一个人");
        }

    }

}
