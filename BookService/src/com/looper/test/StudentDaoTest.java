package com.looper.test;


import com.looper.dao.StudentDao;
import com.looper.dao.impl.StudentDaoImpl;
import com.looper.domain.Student;

public class StudentDaoTest {

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.allStudent()) {
            System.out.println(student);
        }

    }

}
