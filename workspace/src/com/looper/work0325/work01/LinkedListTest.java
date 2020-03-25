package com.looper.work0325.work01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Dog> ll = new LinkedList<Dog>();

        ll.add(new Dog("oo","雪纳瑞"));
        ll.add(new Dog("yy","拉布拉多"));

        ll.add(new Dog("ff","拉布拉多"));
        ll.add(new Dog("mm","雪纳瑞"));

        System.out.println("总共有"+ll.size()+"条狗");

        System.out.println("分别是：");

        for (Dog dog : ll) {
            System.out.println(dog.getName()+"    "+dog.getType());
        }

        /*Iterator<Dog> iterator = ll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName()+"    "+iterator.next().getType());
        }*/

    }

}
