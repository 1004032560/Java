package com.looper.work0311.work3.dao;

import com.looper.work0311.work3.domain.Student;

public interface StudentDao {

    boolean addStudent(Student student) ;

    void showAllStudents();

    boolean modifyScore(int sid,int score);

    Student findStudentBySid(int sid);

}
