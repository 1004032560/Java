package com.looper.day4.test2;

import java.sql.*;
import java.util.Scanner;

public class JDBCSelectTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Connection conn = null;
        //Statement sta = null;
        PreparedStatement ps = null;

        try {
            //1、加载类驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01?characterEncoding=utf-8","root","123looper.");
            //3、操作
            //准备sql语句
            String sql = "select * from students";

            ps = conn.prepareStatement(sql);

            //执行返回结果
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt("sid");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                System.out.println(id+"\t\t"+name+"\t\t"+age+"\t\t"+sex);
            }

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
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
