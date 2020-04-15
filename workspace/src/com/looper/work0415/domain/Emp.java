package com.looper.work0415.domain;

import java.sql.Timestamp;

public class Emp {

    private int empNo;
    private String name;
    private String password;
    private Timestamp hireDate;
    private double salary;
    private String role;

    public Emp() {
    }

    public Emp(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Emp(String name, String password, Timestamp hireDate, double salary) {
        this.name = name;
        this.password = password;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Emp(int empNo, String name, String password, Timestamp hireDate, double salary, String role) {
        this.empNo = empNo;
        this.name = name;
        this.password = password;
        this.hireDate = hireDate;
        this.salary = salary;
        this.role = role;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
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

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
