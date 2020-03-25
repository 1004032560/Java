package com.looper.day3.test4;

import com.looper.day1.test1.Student;

import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {

        Vector<Student> vector = new Vector<>();

        System.out.println("LinkedList集合的大小："+vector.size());

        vector.add(new Student(1001,"jkl"));
        vector.add(new Student(1002,"qwe"));

        vector.add(new Student(1003,"iop"));
        vector.add(new Student(1004,"zxc"));

        System.out.println("LinkedList集合的大小："+vector.size());

        System.out.println("======================");
        //遍历
        for (Student student : vector) {
            System.out.println(student);
        }


    }

}
