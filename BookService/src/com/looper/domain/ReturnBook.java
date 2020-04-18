package com.looper.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class ReturnBook implements Serializable {

    private static final long serialVersionUID = -8361871109174820993L;

    private int retId;
    private Student student;
    private Book book;
    private Admin admin;
    private Timestamp borDate;

    public ReturnBook() {
    }

    public ReturnBook(Student student, Book book, Admin admin, Timestamp borDate) {
        this.student = student;
        this.book = book;
        this.admin = admin;
        this.borDate = borDate;
    }

    @Override
    public String toString() {
        return "还书信息{" +
                "  还书ID:" + retId +
                ", 学生姓名:" + student +
                ", 书名:" + book.getBookName() +
                ", 作者" + book.getBookAuthor() +
                ", 管理员" + admin.getAdminName() +
                ", 借书日期:" + borDate +
                " }";
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Timestamp getBorDate() {
        return borDate;
    }

    public void setBorDate(Timestamp borDate) {
        this.borDate = borDate;
    }
}
