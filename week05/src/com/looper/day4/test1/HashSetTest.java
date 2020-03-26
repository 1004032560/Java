package com.looper.day4.test1;

import com.looper.day1.test1.Student;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student(1001,"jkl"));
        hashSet.add(new Student(1002,"uio"));

        for (Student student : hashSet) {
            System.out.println(student.toString());
        }

    }

}
