package com.looper.day3.test2;


/**
 * 体现的是：关联关系
 */

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student(1001,"王凯");
        Student student2 = new Student(1002,"王悦");
        Student student3 = new Student(1003,"王杰");
        Student student4 = new Student(1004,"王岩");

        Student [] students1 = new Student[]{student1,student2};
        Student [] students2 = new Student[]{student3,student4};

        Grade grade1 = new Grade(101,"一年级一班",students1);

        Grade grade2 = new Grade(102,"一年级二班",students2);

        grade1.show();
        grade2.show();
    }

}
