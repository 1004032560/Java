package com.looper.work0326.work01.domain;

public class Book {

    private int bid;
    private String name;
    private String author;

    public Book() {
    }

    public Book(int bid, String name, String author) {
        this.bid = bid;
        this.name = name;
        this.author = author;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "书籍编号:" + bid + "\t 书籍名:" + name + "\t\t 作者:" + author;
    }
}
