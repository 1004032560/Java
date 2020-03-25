package com.looper.work0325.work02.test;

import com.looper.work0325.work02.dao.impl.BookDaoImpl;
import com.looper.work0325.work02.dao.impl.UserDaoImpl;
import com.looper.work0325.work02.domain.Book;
import com.looper.work0325.work02.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserDaoImpl userDaoImpl = new UserDaoImpl();
        List<User> alUser = new ArrayList<>();

        for (User allUser : userDaoImpl.findAllUsers()) {
            System.out.println(allUser);
        }

        BookDaoImpl bookDaoImpl = new BookDaoImpl();
        List<Book> alBook = new ArrayList<>();



        loop:while (true) {
            System.out.println("==========主菜单=========");
            System.out.println("       1.登录");
            System.out.println("       0.退出");
            System.out.println("========================");
            System.out.print("请输入选择：");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("=========登录界面=========");
                System.out.print("       请输入用户名：");
                String username = scanner.next();
                System.out.print("       请输入密码：");
                String password = scanner.next();
                System.out.println("========================");
                loop1:
                for (User user : userDaoImpl.findAllUsers()) {
                    if (user==userDaoImpl.findUserByUsernameAndPassword(username,password)) {
                        System.out.println("登录成功！");

                        if (user.getRole().equals("admin")) {
                            while (true) {
                                System.out.println("=========欢迎进入管理员界面=========");
                                System.out.println("       1、查询全部用户信息");
                                System.out.println("       2、修改用户的角色 ");
                                System.out.println("       3、查看全部的图书信息 ");
                                System.out.println("       4、添加新书籍 ");
                                System.out.println("       0、退出 ");
                                System.out.println("========================");

                                System.out.print("请输入选择：");
                                int num2 = scanner.nextInt();

                                switch (num2) {

                                    case 1: {
                                        for (User user1 : userDaoImpl.findAllUsers()) {
                                            System.out.println(user1.toString());
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("请输入要修改角色的用户名：");
                                        String username1 = scanner.next();

                                        for (User user1 : userDaoImpl.findAllUsers()) {
                                            if (user1.getUsername() == username1) {
                                                if (user1.getRole() == "admin") {
                                                    user1.setRole("common");
                                                } else {
                                                    user1.setRole("admin");
                                                }
                                            }
                                        }

                                        break;
                                    }
                                    case 3: {
                                        for (Book book : bookDaoImpl.findAllBooks()) {
                                            System.out.println(book.toString());
                                        }
                                        break;
                                    }
                                    case 4:{
                                        while(true){
                                            System.out.print("请输入图书的ID：");
                                            int id = scanner.nextInt();
                                            System.out.print("请输入图书的名字：");
                                            String name = scanner.next();
                                            System.out.print("请输入图书的作者：");
                                            String author = scanner.next();
                                            Book book = new Book(id,name,author);
                                            bookDaoImpl.addBook(book);
                                            System.out.print("是否继续添加数据：");
                                            String next = scanner.next();

                                            if ("n".equals(next)){
                                                break;
                                            }
                                        }
                                        break;
                                    }

                                    case 0: {
                                        break loop1;
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                System.out.println("=========欢迎进入用户界面=========");
                                System.out.println("       1、查看全部的图书信息");
                                System.out.println("       2、根据id查找图书");
                                System.out.println("       3、根据作者查找图书 ");
                                System.out.println("       0、退出 ");
                                System.out.println("========================");

                                System.out.print("请输入选择：");
                                int num2 = scanner.nextInt();

                                switch (num2) {

                                    case 1: {
                                        for (Book book : bookDaoImpl.findAllBooks()) {
                                            System.out.println(book.toString());
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("请输入要查找的书籍编号：");
                                        int num3 = scanner.nextInt();
                                        Book book = bookDaoImpl.findBookByBid(num3);

                                        if (book == null) {
                                            System.out.println("未找到该书籍");
                                        } else {
                                            System.out.println("书籍编号:" + book.getBid() + "\t 书籍名:" + book.getName() + "\t\t 作者:" + book.getAuthor());

                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("请输入要查找的书籍作者：");
                                        String author1 = scanner.next();
                                        List<Book> book = bookDaoImpl.findBooksByAuthor(author1);

                                        for (Book book1 : book) {
                                            if (book1 == null) {
                                                System.out.println("未找到该书籍");
                                            } else {
                                                System.out.println("书籍编号:" + book1.getBid() + "\t 书籍名:" + book1.getName() + "\t\t 作者:" + book1.getAuthor());
                                            }
                                        }

                                        break;
                                    }
                                    case 0: {
                                        break loop1;
                                    }
                                }

                            }

                        }

                    }
                }

                System.out.println("=========登录界面=========");
                System.out.println("用户名或密码错误！是否继续登录？");
                System.out.println("       1、继续登录？");
                System.out.println("       0、退出？");
                System.out.println("========================");
                System.out.println("请输入选择：");
                int num1 = scanner.nextInt();
                if (num1 == 0) {
                    break loop;
                }
            }else {
                System.out.print("确认退出y/n：");
                String str = scanner.next();
                if ("y".equals(str)) {
                    break;
                }
            }
        }
    }
}