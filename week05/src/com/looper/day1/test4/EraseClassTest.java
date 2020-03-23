package com.looper.day1.test4;

public class EraseClassTest {

    public void f1(Person<Car> person){
        System.out.println("Car执行成功");
    }

    /*public void f1(Person<House> person){
        System.out.println("执行成功");
    }*/

    public void f2(Person<House> person){
        System.out.println("House执行成功");
    }

    public static void main(String[] args) {

        Person<Car> person1 = new Person<>();
        System.out.println(person1.count);
        person1.count = 2;
        System.out.println(person1.count);

        Person<House> person2 = new Person<>();
        System.out.println(person2.count);

    }

}
