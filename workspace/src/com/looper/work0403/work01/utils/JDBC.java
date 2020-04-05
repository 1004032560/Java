package com.looper.work0403.work01.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    public static Connection conn = null;
    private static String mySQLDriver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test01?characterEncoding=utf-8";
    private static String user = "root";
    private static String password = "123looper.";

    public static void JDBCConn() {

        try {
            //1.加载驱动类
            Class.forName(mySQLDriver);
            //2.获取连接对象
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void JDBCClose(){
        try {
            //4.关闭数据库
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
