package com.looper.work0311.work3;

import com.looper.work0311.work3.dao.impl.StudentDaoImpl;
import com.looper.work0311.work3.domain.Student;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student(1001,"张三",19,99);

        Student student2 = new Student(1002,"李四",18,84);

        Student student3 = new Student(1003,"王五",17,88);

        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

        if (studentDaoImpl.addStudent(student1)){
            System.out.println("录入成功一次");
        }
        if (studentDaoImpl.addStudent(student2)){
            System.out.println("录入成功两次");
        }
        if (studentDaoImpl.addStudent(student3)){
            System.out.println("录入成功三次");
        }

        studentDaoImpl.showAllStudents();

        if (studentDaoImpl.modifyScore(1003,80)){
            System.out.println("更改成功");
        }

        studentDaoImpl.showAllStudents();

        Student student = studentDaoImpl.findStudentBySid(1004);

        System.out.print("找到的结果是：");
        if (student instanceof Student){
            student.show();
        }else{
            System.out.println("NULL");
        }

    }

}
