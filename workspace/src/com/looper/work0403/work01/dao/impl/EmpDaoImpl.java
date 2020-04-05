package com.looper.work0403.work01.dao.impl;

import com.looper.work0403.work01.dao.EmpDao;
import com.looper.work0403.work01.domain.Emp;
import com.looper.work0403.work01.utils.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

    List<Emp> allEmps = new ArrayList<>();

    @Override
    public List<Emp> allEmp() {
        List<Emp> emps = new ArrayList<>();
        JDBC.JDBCConn();
        //查询所有的用户
        PreparedStatement ps = null;
        String sql = "select * from emp";
        try {
            ps = JDBC.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Emp emp = null;
            while(rs.next()) {
                emp = new Emp();
                emp.setEmpno(rs.getInt("empno"));
                emp.setEname(rs.getString("ename"));
                emp.setPassword(rs.getString("password"));
                emp.setHiredate(rs.getDate("hiredate"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setRole(rs.getString("role"));
                emps.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }
        return emps;
    }

    @Override
    public boolean modifyRoleByEmpno(int empno,String newRole) {

        boolean flag = false;
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select * from emp where empno=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setInt(1, empno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String sql = "update emp set role=? where empno=?";
                ps = JDBC.conn.prepareStatement(sql);
                ps.setString(1, newRole);
                ps.setInt(2, empno);
                ps.executeUpdate();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }

        return flag;
    }

    @Override
    public boolean modifySalaryByEmpno(int empno,Double newSalary) {
        boolean flag = false;
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select * from emp where empno=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setInt(1,empno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String sql = "update emp set salary=? where empno=?";
                ps = JDBC.conn.prepareStatement(sql);
                ps.setDouble(1,newSalary);
                ps.setInt(2,empno);
                ps.executeUpdate();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }
        return flag;
    }

    @Override
    public Emp showEmp(String ename) {
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select * from emp where ename=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setString(1,ename);
            ResultSet rs = ps.executeQuery();
            Emp emp = null;
            while(rs.next()){
                emp = new Emp();
                emp.setEmpno(rs.getInt("empno"));
                emp.setEname(rs.getString("ename"));
                emp.setPassword(rs.getString("password"));
                emp.setHiredate(rs.getDate("hiredate"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setRole(rs.getString("role"));
                return emp;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }
        return null;
    }

    @Override
    public boolean findEmpByEname(String ename) {
        boolean flag = false;
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select ename,password from emp where ename=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setString(1,ename);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }
        return flag;
    }

    @Override
    public boolean addEmp(int empno, String ename, String password,Double salary, String role) {
        boolean flag = false;

        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sql = "insert into emp values(?,?,?,now(),?,?)";
            ps = JDBC.conn.prepareStatement(sql);
            ps.setInt(1, empno);
            ps.setString(2, ename);
            ps.setString(3, password);
            ps.setDouble(4, salary);
            ps.setString(5, role);

            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            System.out.println("密码不能重复！");
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }

        return flag;
    }

    @Override
    public boolean addEmp(int empno, String ename, String password, Double salary) {
        boolean flag = false;

        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sql = "insert into emp(empno,ename,password,hiredate,salary) values(?,?,?,now(),?)";
            ps = JDBC.conn.prepareStatement(sql);
            ps.setInt(1, empno);
            ps.setString(2, ename);
            ps.setString(3, password);
            ps.setDouble(4, salary);

            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }

        return flag;
    }

    @Override
    public boolean modifyPassword(String ename, String password, String newPassword) {
        boolean flag = false;
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select ename,password from emp where ename=? and password=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setString(1,ename);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String sql = "update emp set password=? where ename=?";
                ps = JDBC.conn.prepareStatement(sql);
                ps.setString(1, newPassword);
                ps.setString(2, ename);
                ps.executeUpdate();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }

        return flag;
    }

    @Override
    public boolean findEmpByEnameAndPassword(String ename, String password) {
        boolean flag = false;
        JDBC.JDBCConn();
        PreparedStatement ps = null;
        try {
            String sqlSel = "select * from emp where ename=? and password=?";
            ps = JDBC.conn.prepareStatement(sqlSel);
            ps.setString(1,ename);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBC.JDBCClose();
        }

        return flag;
    }

}
