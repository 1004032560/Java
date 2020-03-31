package com.looper.work0331.work01;

public class SingleTest1 {

    public static void main(String[] args) {

        Student1 student11 = Student1.getInstance();
        Student1 student12 = Student1.getInstance();

        System.out.println(student11==student12);

    }

}
