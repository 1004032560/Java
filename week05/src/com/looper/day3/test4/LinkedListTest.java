package com.looper.day3.test4;

import com.looper.day1.test1.Student;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Student> ll = new LinkedList<Student>();

        System.out.println("LinkedList集合的大小："+ll.size());

        ll.add(new Student(1001,"jkl"));
        ll.add(new Student(1002,"qwe"));
        ll.add(new Student(1003,"zxc"));
        ll.add(new Student(1004,"iop"));

        System.out.println("======================");
        System.out.println("LinkedList集合的大小："+ll.size());

        System.out.println("======================");
        //遍历
        for (Student student : ll) {
            System.out.println(student);
        }

        System.out.println("======================");
        //添加新的数据
        ll.addFirst(new Student(1005,"我靠"));

        System.out.println("======================");
        //遍历
        for (Student student : ll) {
            System.out.println(student);
        }

        System.out.println("======================");
        //删除元素
        ll.removeFirst();
        //遍历
        for (Student student : ll) {
            System.out.println(student);
        }

    }

}
