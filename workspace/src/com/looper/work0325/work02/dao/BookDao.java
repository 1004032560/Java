package com.looper.work0325.work02.dao;

import com.looper.work0325.work02.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAllBooks();
    Book findBookByBid(int bid);
    List<Book> findBooksByAuthor(String author);
    void addBook(Book book);

}
