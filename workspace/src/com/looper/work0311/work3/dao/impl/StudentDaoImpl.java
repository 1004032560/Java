package com.looper.work0311.work3.dao.impl;

import com.looper.work0311.work3.dao.StudentDao;
import com.looper.work0311.work3.domain.Student;

public class StudentDaoImpl implements StudentDao {

    Student[] students = new Student[3];
    int num = 0;

    public StudentDaoImpl() {
    }

    public StudentDaoImpl(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    //添加学生
    @Override
    public boolean addStudent(Student student) {

        boolean flag = false;
        if (num<students.length){
            students[num] = student;
            num++;
            flag = true;
        }
        return flag;
    }

    //显示学生信息
    @Override
    public void showAllStudents() {
        System.out.println("===========================学生信息系统=========================");
        for (Student student : students) {
            student.show();
        }
        System.out.println("================================================================");
    }

    //修改学生分数
    @Override
    public boolean modifyScore(int sid, int score) {

        for (Student student : students) {
            if (student.getSid()==sid){
                if (score>=0 && score<=100){
                    student.setScore(score);
                    return true;
                }
            }
        }
        return false;
    }

    //通过 Sid 查找学生
    @Override
    public Student findStudentBySid(int sid) {
        for (Student student : students) {
            if (student.getSid()==sid){
                return student;
            }
        }
        return null;
    }

}
