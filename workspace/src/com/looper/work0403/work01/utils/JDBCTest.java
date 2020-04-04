package com.looper.work0403.work01.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {

    public void JDBC(String str) throws ClassNotFoundException, SQLException {

        //1.加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01?characterEncoding=utf-8","root","123looper.");

        //3.操作
        PreparedStatement ps = conn.prepareStatement(str);
    }

}
