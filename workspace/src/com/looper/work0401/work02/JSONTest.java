package com.looper.work0401.work02;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {

    public static void main(String[] args) {

        //List集合
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(1002,"looper2",56));
        students1.add(new Student(1003,"looper3",89));

        //Map集合
        Map<Integer,Student> students2 = new HashMap<Integer,Student>();
        students2.put(101,new Student(1004,"looper4",85));
        students2.put(102,new Student(1002,"looper5",78));

        Gson gson = new Gson();

        String listStr = gson.toJson(students1);
        System.out.println("把List集合转换成JSON格式："+listStr);

        String mapStr = gson.toJson(students1);
        System.out.println("把Map集合转换成JSON格式："+mapStr);


    }

}
