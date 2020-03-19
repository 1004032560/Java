package com.looper.work0314.work2.dao;

import com.looper.work0314.work2.domain.Book;

public interface BookDao {

    Book[] findAllBooks();
    Book[] findBookByBid(int bid);
    Book findBooksByAuthor(String author);

}
