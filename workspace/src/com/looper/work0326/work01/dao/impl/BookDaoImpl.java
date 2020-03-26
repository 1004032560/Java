package com.looper.work0326.work01.dao.impl;



import com.looper.work0326.work01.dao.BookDao;
import com.looper.work0326.work01.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    static List<Book> al = new ArrayList<>();

    static{
        al.add(new Book(1001,"倚天屠龙记","金庸"));
        al.add(new Book(1002,"楚留香传","古龙"));
        al.add(new Book(1003,"七剑下天山","梁羽生"));
        al.add(new Book(1004,"天龙八部","金庸"));
        al.add(new Book(1005,"绝代双骄","古龙"));
    }

    @Override
    public List<Book> findAllBooks() {
        return al;
    }

    @Override
    public Book findBookByBid(int bid) {
        for (Book book : al) {
            if (book.getBid()==bid){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> lb = new ArrayList<>();
        for (Book book : al) {
            if (book.getAuthor().equals(author)){
                lb.add(book);
            }
        }
        return lb;
    }

    @Override
    public void addBook(Book book) {
        al.add(book);
    }
}
