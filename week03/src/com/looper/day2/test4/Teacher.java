package com.looper.day2.test4;

public class Teacher extends People {

    private int salary;

    /*public Teacher(){
        //父类没有无参构造时，子类有无参构造会报错
    }*/

    public Teacher(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }
}
