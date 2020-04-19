package com.looper.domain;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -8066214015665843437L;

    private int stuId;
    private String stuName;
    private String stuPassword;
    private String stuSex;
    private String stuGrade;
    private int stuBorBookNum;
    private String stuPhone;

    public Student() {
    }

    public Student(String stuName, String stuPassword) {
        this.stuName = stuName;
        this.stuPassword = stuPassword;
    }

    public Student(String stuName, String stuPassword, String stuSex, String stuGrade, String stuPhone) {
        this.stuName = stuName;
        this.stuPassword = stuPassword;
        this.stuSex = stuSex;
        this.stuGrade = stuGrade;
        this.stuPhone = stuPhone;
    }

    public Student(int stuId, String stuName, String stuPassword, String stuSex, String stuGrade, int stuBorBookNum, String stuPhone) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPassword = stuPassword;
        this.stuSex = stuSex;
        this.stuGrade = stuGrade;
        this.stuBorBookNum = stuBorBookNum;
        this.stuPhone = stuPhone;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuBorBookNum() {
        return stuBorBookNum;
    }

    public void setStuBorBookNum(int stuBorBookNum) {
        this.stuBorBookNum = stuBorBookNum;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "  学号:" + stuId +
                ", 姓名:" + stuName +
                ", 密码:" + stuPassword +
                ", 性别:" + stuSex +
                ", 年级:" + stuGrade +
                ", 借书数量:" + stuBorBookNum +
                ", 联系方式:" + stuPhone +
                " }";
    }
}
