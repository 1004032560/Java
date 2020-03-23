package com.looper.work0323.work04;

public class Test {

    public static void main(String[] args) {

        Student<Work> student1 = new Student<Work>(1001,"looper1",new Work(101,"looper1",true));

        Student<Course> student2 = new Student<Course>(1001,"looper2",new Course(101,"looper2"));

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        Work work = student1.getE();

        System.out.println(work);

    }

}
