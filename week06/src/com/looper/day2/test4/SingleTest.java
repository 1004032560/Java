package com.looper.day2.test4;

public class SingleTest {

    public static void main(String[] args) {

        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();

        System.out.println("是否为同一个对象："+(student1==student2));
    }

}
