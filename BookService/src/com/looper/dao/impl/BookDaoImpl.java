package com.looper.dao.impl;

import com.looper.dao.BookDao;
import com.looper.domain.Book;

import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> allBooks() {
        return null;
    }

    @Override
    public Book findBookById(int bookId) {
        return null;
    }

    @Override
    public List<Book> findBookByName(String bookName) {
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String bookAuthor) {
        return null;
    }

    @Override
    public List<Book> findBookByPress(String bookPress) {
        return null;
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean deleteBook() {
        return false;
    }

    @Override
    public boolean modifyBook(Book book) {
        return false;
    }
}
