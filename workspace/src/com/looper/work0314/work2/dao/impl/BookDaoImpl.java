package com.looper.work0314.work2.dao.impl;

import com.looper.work0314.work2.dao.BookDao;
import com.looper.work0314.work2.domain.Book;

public class BookDaoImpl implements BookDao {

    public static Book [] books = new Book[5];

    static{
        books[0] = new Book(1001,"倚天屠龙记","金庸");
        books[1] = new Book(1002,"楚留香传","古龙");
        books[2] = new Book(1003,"七剑下天山","梁羽生");
        books[3] = new Book(1004,"天龙八部","金庸");
        books[4] = new Book(1005,"绝代双骄","古龙");
    }

    @Override
    public Book[] findAllBooks() {
        return books;
    }

    @Override
    public Book[] findBookByBid(int bid) {
        //1.统计当前满足条件的数的个数
        int count = 0;
        for (Book book : books) {
            if (book.getBid()==bid){
                count++;
            }
        }

        if (count!=0){
            //2.创建数组，长度=满足条件的书的个数
            Book [] books2 = new Book[count];

            //3.满足条件的书放到数组中
            int i = 0;
            for (Book book : books) {
                if (book.getBid()==bid){
                    books2[i] = book;
                    i++;
                }
            }
            return books2;
        }else{
            System.out.println("该数不存在");
        }
        return null;
    }

    @Override
    public Book findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                return book;
            }
        }
        return null;
    }
}
