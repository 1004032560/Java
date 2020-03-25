package com.looper.day3.test3;

import com.looper.day1.test1.Student;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        //创建Array集合对象
        ArrayList arrayList = new ArrayList();

        //查看集合大小
        System.out.println("集合的大小："+arrayList.size());

        //集合中添加数据
        arrayList.add("whj");
        arrayList.add(123);
        arrayList.add('A');
        arrayList.add(12.35);
        arrayList.add(120);

        arrayList.add(new Student(1001,"jkl"));

        System.out.println("===============");
        System.out.println("集合的大小："+arrayList.size());

        System.out.println("===============");
        //获取某个对象
        Object object = arrayList.get(3);
        System.out.println(object);

        System.out.println("===============");
        //for循环遍历数据
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }

}
