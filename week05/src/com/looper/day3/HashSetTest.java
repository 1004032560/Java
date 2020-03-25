package com.looper.day3;

import com.looper.day1.test1.Student;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();
        Student student = new Student(1005,"iop");

        hashSet.add(new Student(1002,"jkl"));
        hashSet.add(new Student(1003,"qwe"));
        hashSet.add(new Student(1004,"zxc"));
        hashSet.add(student);

        System.out.println("ArrayList集合大小"+hashSet.size());

        student = new Student(1006,"iop");

        //可以添加同一个对象，但是这两个次数据不能相同
        hashSet.add(student);

        //允许放空值null;只能放一个
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("ArrayList集合大小"+hashSet.size());

        System.out.println("===================");
        //遍历不能采用普通for循环，因为Set集合无序
        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===================");
        for (Student student1 : hashSet) {
            System.out.println(student1);
        }

    }

}
