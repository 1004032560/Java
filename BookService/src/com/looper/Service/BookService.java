package com.looper.Service;

import com.looper.domain.Book;

import java.util.List;

public interface BookService {

    //查找所有图书
    List<Book> allBooks();

    //通过ID查找图书
    Book findBookById(int bookId);

    //通过书名查找图书
    List<Book> findBookByName(String bookName);

    //通过作者查找图书
    List<Book> findBookByAuthor(String bookAuthor);

    //通过出版社查找图书
    List<Book> findBookByPress(String bookPress);

    //添加图书
    boolean addBook(Book book);

    //删除图书
    boolean deleteBook();

    //修改图书信息
    boolean modifyBook(Book book);

}
