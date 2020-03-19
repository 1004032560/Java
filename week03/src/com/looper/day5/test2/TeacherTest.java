package com.looper.day5.test2;

public class TeacherTest {

    public static void main(String[] args) {

        Teacher teacher =new Teacher();

        System.out.println(teacher);
        System.out.println(teacher.toString());
        System.out.println("================");
        System.out.println(teacher.hashCode());
        System.out.println(Integer.toHexString(teacher.hashCode()));

    }
}
