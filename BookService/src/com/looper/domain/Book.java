package com.looper.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 4348058704713226553L;

    private int bookId;
    private String bookName;
    private String bookCategory;
    private String bookAuthor;
    private String bookPress;
    private double bookPrice;
    private int bookNum;

    public Book() {
    }

    public Book(String bookName, String bookCategory, String bookAuthor, String bookPress, double bookPrice, int bookNum) {
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
        this.bookPress = bookPress;
        this.bookPrice = bookPrice;
        this.bookNum = bookNum;
    }

    public Book(int bookId, String bookName, String bookCategory, String bookAuthor, String bookPress, double bookPrice, int bookNum) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
        this.bookPress = bookPress;
        this.bookPrice = bookPrice;
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "  图书ID:" + bookId +
                ", 书名:" + bookName +
                ", 类别:" + bookCategory +
                ", 作者:" + bookAuthor +
                ", 出版社:" + bookPress +
                ", 单价:" + bookPrice +
                ", 数量:" + bookNum +
                " }";
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

}
