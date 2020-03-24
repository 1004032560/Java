package com.looper.day2.test4;

import com.looper.day2.domain.People;
import com.looper.day2.domain.Student;

public class TestStudent {

    public static void main(String[] args) {

        People p = new People(1001,"李三",18);
        System.out.println("++++++++++");

        Student s1 = new Student();
        System.out.println("**********");

        Student s2 = new Student(99);
        System.out.println("///////////");

        Student s3 = new Student("lishi",99);
        System.out.println("-------------");


        Student s4 = new Student(1003,"李五",15,100);
    }

}
