package com.looper.work0323.work04;

public class Test2 {

    public static void main(String[] args) {

        Student2 student1 = new Student2(1001,"looper1",new Work(101,"looper1",true));

        Student2 student2 = new Student2(1001,"looper1",new Course(101,"looper1"));

        Object object = student2.getObject();

        Course courseObject = (Course) object;

        System.out.println(courseObject);

    }

}
