package com.looper.day4.test1;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Connection conn = null;
        //Statement sta = null;
        PreparedStatement prsta = null;

        try {
            //1、加载类驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01?characterEncoding=utf-8","root","123looper.");
            //3、操作
            System.out.print("请输入name:");
            String name = scanner.next();
            System.out.print("请输入age:");
            int age = scanner.nextInt();
            System.out.print("请输入sex:");
            String sex = scanner.next();
            //sta = conn.createStatement();
            //String sql = "insert into students(name,age,sex) values('"+name+"',"+age+",'"+sex+"')";
            //执行SQL语句
            //int count = sta.executeUpdate(sql);

            //准备语句
            String sql = "insert into students(name,age,sex) values(?,?,?)";
            prsta = conn.prepareStatement(sql);

            //解决？号
            prsta.setString(1,name);
            prsta.setInt(2,age);
            prsta.setString(3,sex);

            int count = prsta.executeUpdate();
            System.out.println("受影响的行数"+count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                prsta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
