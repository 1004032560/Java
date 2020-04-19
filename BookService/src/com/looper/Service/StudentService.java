package com.looper.Service;

import com.looper.domain.Student;

import java.util.List;

public interface StudentService {

    //查找所有学生
    List<Student> allStudent();

    //通过ID查找学生
    Student findStudent(int stuId);

    //通过姓名查找学生
    Student findStudent(String stuName);

    //通过姓名和password查找学生
    Student findStudent(String stuName, String stuPassword);

    //修改学生信息
    boolean modifyStudent(Student student);

    //添加学生
    boolean addStudent(Student student);

    //删除学生
    boolean deleteStudent();

}
