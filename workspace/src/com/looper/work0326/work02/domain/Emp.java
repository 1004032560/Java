package com.looper.work0326.work02.domain;

import java.time.LocalDateTime;

public class Emp {
    private int empno;
    private String ename;
    private String password;
    private LocalDateTime hiredate;
    private int salary;
    private String role;

    public Emp(int empno, String ename, String password, LocalDateTime hiredate, int salary, String role) {
        this.empno = empno;
        this.ename = ename;
        this.password = password;
        this.hiredate = hiredate;
        this.salary = salary;
        this.role = role;
    }

    public Emp() {
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

    public LocalDateTime getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDateTime hiredate) {
        this.hiredate = hiredate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
}
