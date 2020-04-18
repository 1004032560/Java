package com.looper.dao.impl;


import com.looper.dao.StudentDao;
import com.looper.domain.Student;
import com.looper.util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> allStudent() {
        List<Student> students = new ArrayList<>();
        JDBCUtil.getConn();
        String sql = "select * from students where sut_flag=?";
        ResultSet rs = null;
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            JDBCUtil.ps.setInt(1,1);
            rs = JDBCUtil.ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("stu_id");
                String name = rs.getString("stu_name");
                String password = rs.getString("stu_password");
                String sex = rs.getString("stu_sex");
                String grade = rs.getString("stu_grade");
                int borNum = rs.getInt("stu_bor_book_num");
                String phone = rs.getString("stu_phone");
                int flag = rs.getInt("sut_flag");
                students.add(new Student(id,name,password,sex,grade,borNum,phone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBCUtil.getClose();
        }
        return students;
    }

    @Override
    public Student findStudent(int stuId) {
        return null;
    }

    @Override
    public Student findStudent(String stuName) {
        return null;
    }

    @Override
    public Student findStudent(String stuName, String stuPassword) {
        return null;
    }

    @Override
    public boolean modifyStudent(Student student) {
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public boolean deleteStudent() {
        return false;
    }
}
