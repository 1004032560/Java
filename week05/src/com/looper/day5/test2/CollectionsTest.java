package com.looper.day5.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<StudentInner> al = new ArrayList<>();

        al.add(new StudentInner(100,"jkl",88));
        al.add(new StudentInner(101,"qwe",98));
        al.add(new StudentInner(102,"uio",92));

        for (StudentInner student : al) {
            System.out.println(student.toString());
        }

        System.out.println("=========================");

        Collections.sort(al);

        for (StudentInner student : al) {
            System.out.println(student.toString());
        }

    }

}
