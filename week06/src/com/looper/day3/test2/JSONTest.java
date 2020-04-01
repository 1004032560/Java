package com.looper.day3.test2;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {

    public static void main(String[] args) {

        User user = new User(1001,"looper","123456");

        //List集合
        List<User> users = new ArrayList<>();
        users.add(new User(1002,"looper2","123456"));
        users.add(new User(1003,"looper3","123456"));

        //Map集合
        Map<Integer,User> users1 = new HashMap<Integer,User>();
        users1.put(101,new User(1002,"looper2","123456"));
        users1.put(102,new User(1003,"looper3","123456"));

        //创建Gson对象
        Gson gson = new Gson();

        //调用方法，将对象转换为Json格式
        String str = gson.toJson(user);
        System.out.println("将对象转换为Json格式:"+str);

        //将Json格式转换为对象
        User newUser = gson.fromJson(str,User.class);
        System.out.println("将Json格式转换为对象:"+newUser);

        //将List集合的对象转换为Json格式
        String listStr = gson.toJson(users);
        System.out.println("将List集合对象的转换为Json格式:"+listStr);

        //将Map集合的对象转换为Json格式
        String mapStr = gson.toJson(users1);
        System.out.println("将Map集合的对象转换为Json格式:"+mapStr);
    }

}
