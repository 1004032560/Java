package com.looper.day3.test3;

import com.looper.day1.test1.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(new Student(1001,"jkl"));
        arrayList.add(new Student(1002,"qwe"));
        arrayList.add(new Student(1003,"zxc"));
        arrayList.add(new Student(1004,"iop"));

        System.out.println("ArrayList集合大小"+arrayList.size());

        System.out.println("===================");
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("===================");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        arrayList.clone();

        System.out.println(arrayList.contains("jkl"));

        arrayList.clear();

        System.out.println("===================");
        Iterator<Student> iterator = arrayList.iterator();
        while(iterator.hasNext()){//判断集合中是否有下一个元素
            System.out.println(iterator.next());//返回迭代中的下一个元素。
        }

        System.out.println("===================");
        //System.out.println(arrayList.get(10));

    }

}
