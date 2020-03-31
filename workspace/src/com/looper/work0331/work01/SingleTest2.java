package com.looper.work0331.work01;

public class SingleTest2 {

    public static void main(String[] args) {

        Student2 student21 = Student2.getInstance();
        Student2 student22 = Student2.getInstance();

        System.out.println(student21==student22);

    }

}
