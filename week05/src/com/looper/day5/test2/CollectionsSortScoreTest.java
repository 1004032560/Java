package com.looper.day5.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortScoreTest {

    public static void main(String[] args) {

        List<StudentOuter> al = new ArrayList<>();

        al.add(new StudentOuter(100,"jkl",88));
        al.add(new StudentOuter(101,"qwe",98));
        al.add(new StudentOuter(102,"uio",92));

        for (StudentOuter student : al) {
            System.out.println(student.toString());
        }

        System.out.println("=========================");

        Collections.sort(al,new ScoreComparator());

        for (StudentOuter student : al) {
            System.out.println(student.toString());
        }

    }

}
