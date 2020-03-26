package com.looper.work0326.work01.dao;

import com.looper.work0326.work01.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAllBooks();
    Book findBookByBid(int bid);
    List<Book> findBooksByAuthor(String author);
    void addBook(Book book);

}
