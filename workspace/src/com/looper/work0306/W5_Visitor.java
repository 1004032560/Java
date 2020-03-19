package com.looper.work0306;

public class W5_Visitor {

    private String name;
    private int age;

    public W5_Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void judgePrice(){

        if (age>0&&age<=7){
            System.out.println("票价为：0元");
        }else if(age<0){
            System.out.println("年龄不正确！");
        }else{
            System.out.println("票价为：20元");
        }

    }


}
