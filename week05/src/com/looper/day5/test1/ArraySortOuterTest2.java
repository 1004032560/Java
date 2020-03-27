package com.looper.day5.test1;

import java.util.Arrays;

public class ArraySortOuterTest2 {

    public static void main(String[] args) {

        StudentOuter[] students = new StudentOuter[3];

        students[0] = new StudentOuter(103,"jkl",88);
        students[1] = new StudentOuter(101,"qwe",98);
        students[2] = new StudentOuter(102,"uio",92);

        for (StudentOuter student : students) {
            System.out.println(student);
        }

        System.out.println("==================");

        Arrays.sort(students,new IdComparator());
        System.out.println("按照ID排序：");
        for (StudentOuter student : students) {
            System.out.println(student);
        }
    }

}
