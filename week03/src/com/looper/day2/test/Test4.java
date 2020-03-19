package com.looper.day2.test;

public class Test4 {

    public static void main(String[] args) {

        People s1 = new Student(001,"zxc",18,99);
        People t1 = new Teacher(01,"jkl",25,1000);

        Doctor doctor = new Doctor(1001,"李四");

        doctor.treat(s1);
        System.out.println("-----------------------");
        doctor.treat(t1);

    }

}
