package com.looper.Service.impl;

import com.looper.Service.StudentService;
import com.looper.dao.StudentDao;
import com.looper.dao.impl.StudentDaoImpl;
import com.looper.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> allStudent() {
        return studentDao.allStudent();
    }

    @Override
    public Student findStudent(int stuId) {
        return studentDao.findStudent(stuId);
    }

    @Override
    public Student findStudent(String stuName) {
        return studentDao.findStudent(stuName);
    }

    @Override
    public Student findStudent(String stuName, String stuPassword) {
        return studentDao.findStudent(stuName,stuPassword);
    }

    @Override
    public boolean modifyStudent(Student student) {
        return studentDao.modifyStudent(student);
    }

    @Override
    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public boolean deleteStudent() {
        return studentDao.deleteStudent();
    }
}
