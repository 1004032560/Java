package com.looper.domain;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {

    private static final long serialVersionUID = -8688467395069979404L;
    private int num;
    private Object object;
    private List<Admin> admins;
    private List<Student> students;
    private List<Book> books;
    private List<BorrowBook> borrowBooks;
    private List<ReturnBook> returnBooks;
    private String msg;

    public Data(int num) {
        this.num = num;
    }

    public Data(String msg) {
        this.msg = msg;
    }

    public Data(Object object, String msg) {
        this.object = object;
        this.msg = msg;
    }

    public Data(int num, Object object, String msg) {
        this.num = num;
        this.object = object;
        this.msg = msg;
    }

    public Data(List<Admin> admins, String msg) {
        this.admins = admins;
        this.msg = msg;
    }

    public Data(int num, List<Student> students, String msg) {
        this.num = num;
        this.students = students;
        this.msg = msg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(List<BorrowBook> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    public List<ReturnBook> getReturnBooks() {
        return returnBooks;
    }

    public void setReturnBooks(List<ReturnBook> returnBooks) {
        this.returnBooks = returnBooks;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
