package com.looper.work0314.work2.test;

import com.looper.work0314.work2.dao.impl.BookDaoImpl;
import com.looper.work0314.work2.dao.impl.UserDaoImpl;
import com.looper.work0314.work2.domain.Book;
import com.looper.work0314.work2.domain.User;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        BookDaoImpl bookDaoImpl = new BookDaoImpl();
        UserDaoImpl userDaoImpl = new UserDaoImpl();

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[5];
        books = bookDaoImpl.findAllBooks();
        User[] users = new User[5];
        users = userDaoImpl.findAllUsers();


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
                for (User user : users) {
                    if (user==userDaoImpl.findUserByUsernameAndPassword(username,password)) {
                        System.out.println("登录成功！");

                        if (user.getRole().equals("admin")) {
                            while (true) {
                                System.out.println("=========欢迎进入管理员界面=========");
                                System.out.println("       1、查询全部用户信息");
                                System.out.println("       2、修改用户的角色 ");
                                System.out.println("       3、查看全部的图书信息 ");
                                System.out.println("       0、退出 ");
                                System.out.println("========================");

                                System.out.print("请输入选择：");
                                int num2 = scanner.nextInt();

                                switch (num2) {

                                    case 1: {
                                        for (User user1 : users) {
                                            System.out.println(user1.toString());
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("请输入要修改角色的用户名：");
                                        String username1 = scanner.next();

                                        for (User user1 : users) {
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
                                        for (Book book : books) {
                                            System.out.println(book.toString());
                                        }
                                        break;
                                    }
                                    case 0: {
                                        break loop;
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
                                        for (Book book : books) {
                                            System.out.println(book.toString());
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("请输入要查找的书籍编号：");
                                        int num3 = scanner.nextInt();
                                        Book[] books2 = bookDaoImpl.findBookByBid(num3);

                                        if (books2 == null) {
                                            System.out.println("未找到该书籍");
                                        } else {
                                            for (Book book : books2) {
                                                System.out.println("书籍编号:" + book.getBid() + "\t 书籍名:" + book.getName() + "\t\t 作者:" + book.getAuthor());
                                            }

                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("请输入要查找的书籍作者：");
                                        String author1 = scanner.next();
                                        Book book2 = bookDaoImpl.findBooksByAuthor(author1);

                                        if (book2 == null) {
                                            System.out.println("未找到该书籍");
                                        } else {
                                            System.out.println("书籍编号:" + book2.getBid() + "\t 书籍名:" + book2.getName() + "\t\t 作者:" + book2.getAuthor());
                                        }
                                        break;
                                    }
                                    case 0: {
                                        break loop;
                                    }
                                }

                            }

                        }

                    } else {
                        System.out.println("=========登录界面=========");
                        System.out.println("用户名或密码错误！是否继续登录？");
                        System.out.println("       1、继续登录？");
                        System.out.println("       0、退出？");
                        System.out.println("========================");
                        System.out.println("请输入选择：");
                        int num1 = scanner.nextInt();
                        if (num1 == 0) {
                            break loop;
                        } else {
                            break loop1;
                        }
                    }
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