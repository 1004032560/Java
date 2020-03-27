package com.looper.day5.test1;

import java.util.Arrays;

public class ArraySortInnerTest {

    public static void main(String[] args) {

        StudentInner[] students = new StudentInner[3];

        students[0] = new StudentInner(100,"jkl",88);
        students[1] = new StudentInner(101,"qwe",98);
        students[2] = new StudentInner(102,"uio",92);

        Arrays.sort(students);
        for (StudentInner student : students) {
            System.out.println(student);
        }

        System.out.println("==================");
        Arrays.sort(students);

        Arrays.sort(students);
        for (StudentInner student : students) {
            System.out.println(student);
        }
    }

}
