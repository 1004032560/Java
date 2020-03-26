package com.looper.work0326.work01;

        import java.util.HashMap;
        import java.util.Scanner;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<String, String>();
        Scanner input = new Scanner(System.in);

        country.put("US","美利坚合众国");
        country.put("RU","俄罗斯联邦");
        country.put("CN","中华人民共和国");

        System.out.println("请输入您要找的国家");
        String countryName = input.next();
        if (country.get(countryName)!=null){
            System.out.println(country.get(countryName));
        }else {
            System.out.println("此值不存在");
        }

    }
}
