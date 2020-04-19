package com.looper.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class BorrowBook implements Serializable {

    private static final long serialVersionUID = -3201347145258464965L;

    private int borId;
    private Student student;
    private Book book;
    private Admin admin;
    private Timestamp borDate;

    public BorrowBook() {
    }

    public BorrowBook(int borId, Student student, Book book, Admin admin, Timestamp borDate) {
        this.borId = borId;
        this.student = student;
        this.book = book;
        this.admin = admin;
        this.borDate = borDate;
    }

    @Override
    public String toString() {
        return "借书信息{" +
                "  借书ID:" + borId +
                ", 学生姓名:" + student +
                ", 书名:" + book.getBookName() +
                ", 作者" + book.getBookAuthor() +
                ", 管理员" + admin.getAdminName() +
                ", 借书日期:" + borDate +
                " }";
    }

    public int getBorId() {
        return borId;
    }

    public void setBorId(int borId) {
        this.borId = borId;
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
