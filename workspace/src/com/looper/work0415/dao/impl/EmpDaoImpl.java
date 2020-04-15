package com.looper.work0415.dao.impl;

import com.looper.work0415.dao.EmpDao;
import com.looper.work0415.domain.Emp;
import com.looper.work0415.util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
    @Override
    public List<Emp> findAllEmp() {
        List<Emp> emps = new ArrayList<>();
        JDBCUtil.getConn();
        String sql = "select * from emp";
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            ResultSet rs = JDBCUtil.ps.executeQuery();
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String password = rs.getString("password");
                Timestamp hiredate = rs.getTimestamp("hiredate");
                double salary = rs.getDouble("salary");
                String role = rs.getString("role");
                emps.add(new Emp(empno,ename,password,hiredate,salary,role));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.getClose();
        }
        return emps;
    }

    @Override
    public Emp findEmpByEmpNo(int empNo) {
        Emp emp = null;
        JDBCUtil.getConn();
        String sql = "selece * form emp where empno=?";
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            JDBCUtil.ps.setInt(1,empNo);
            ResultSet rs = JDBCUtil.ps.executeQuery();
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String password = rs.getString("password");
                Timestamp hiredate = rs.getTimestamp("hiredate");
                double salary = rs.getDouble("salary");
                String role = rs.getString("role");
                emp = new Emp(empno,ename,password,hiredate,salary,role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.getClose();
        }

        return null;
    }

    @Override
    public boolean modifyRoleByEmpNo(int empNo, String role) {
        boolean flag = false;
        JDBCUtil.getConn();
        String sql = "update from emp set role=? where empno=?";
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            JDBCUtil.ps.setInt(1,empNo);
            JDBCUtil.ps.setString(2,role);
            ResultSet rs = JDBCUtil.ps.executeQuery();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.getClose();
        }
        return flag;
    }

    @Override
    public boolean modifySalaryByEmpNo(int empNo, double salary) {
        boolean flag = false;
        JDBCUtil.getConn();
        String sql = "update from emp set salary=? where empno=?";
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            JDBCUtil.ps.setInt(1,empNo);
            JDBCUtil.ps.setDouble(2,salary);
            ResultSet rs = JDBCUtil.ps.executeQuery();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.getClose();
        }
        return flag;
    }

    @Override
    public boolean modifyPasswordByNameAndPassword(String ename, String password, String newPassword) {
        boolean flag = false;
        JDBCUtil.getConn();
        String sql = "update from emp set newPassword=? where ename=? and password=? ";
        try {
            JDBCUtil.ps = JDBCUtil.conn.prepareStatement(sql);
            JDBCUtil.ps.setString(1,newPassword);
            JDBCUtil.ps.setString(2,ename);
            JDBCUtil.ps.setString(3,password);
            ResultSet rs = JDBCUtil.ps.executeQuery();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.getClose();
        }
        return flag;
    }
}
