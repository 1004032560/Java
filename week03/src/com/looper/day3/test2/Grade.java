package com.looper.day3.test2;

public class Grade {

    private int classId;
    private String className;
    private Student[] students;

    public Grade() {
    }

    public Grade(int classId, String className,Student[] students) {
        this.classId = classId;
        this.className = className;
        this.students = students;
    }

    public void show(){

        System.out.println("===========================================");
        System.out.println("班级名:"+className+" ||   班级ID:"+classId);
        for (Student student : students) {
            System.out.println("学生ID为:"+student.getStudentId()+"     ||   学生姓名为:"+student.getStudentName());
        }
        System.out.println("===========================================");

    }

}