package com.looper.work0403.work01.domain;

import java.util.Date;

public class Emp {

    private int empno;
    private String ename;
    private String password;
    private Date hiredate;
    private double salary;
    private String role;

    public Emp(int empno, String ename, String password, Date hiredate, double salary, String role) {
        this.empno = empno;
        this.ename = ename;
        this.password = password;
        this.hiredate = hiredate;
        this.salary = salary;
        this.role = role;
    }

    public Emp() {
    }

    public Emp(int empno, String ename, String password, Date hiredate, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.password = password;
        this.hiredate = hiredate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", password='" + password + '\'' +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }

    public Emp(String ename, String password) {
        this.ename = ename;
        this.password = password;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
