package com.looper.work0317.work01;

public class CompareTest {
    public static void main(String[] args) {
        String str1="abegad";
        String str2="acegab";
        String str=getSonString(str1,str2);
        System.out.println(str);
    }

    private static String getSonString(String str1,String str2) {
        String max = "", min = "", temp = "";
        //寻找较大以及较小的字符串
        max = str1.length() > str2.length() ? str1 : str2;
        min = (max == str1) ? str2 : str1;
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String substring = min.substring(j, min.length() - i + j);
                if (max.contains(substring)) {
                    if (temp.length() < substring.length()) {
                        temp = substring;
                    }
                }
            }
        }return temp;
    }
}
