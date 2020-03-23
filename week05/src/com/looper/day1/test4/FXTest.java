package com.looper.day1.test4;

public class FXTest {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        System.out.println("==============================");
        //方式1：创建泛型
        Person person1 = new Person(1001,"whj",new House("毛坯房","北京","table"));
        System.out.println(person1);

        System.out.println("==============================");
        //方式2：创建泛型; 类名<泛型类名> 对象名 = new 类名<泛型类名>
        Person<House> person3 = new Person<House>(1001,"whj",new House("茅草屋","北京","bed"));
        House house = person3.getE();
        System.out.println(house);

        System.out.println("==============================");
        Person person2 = new Person(1002,"jkl",new Car("123456","奔驰"));
        Object object = person2.getE();
        System.out.println(person2);

    }

}
