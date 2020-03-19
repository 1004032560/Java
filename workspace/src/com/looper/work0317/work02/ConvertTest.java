package com.looper.work0317.work02;

public class ConvertTest {
    public static void main(String[] args) {
        String str1="ttt5yjd-jdd4yh ";
        String str2= "Hsdkf4sd-fsd3tr";
        String str3="Sf5sd-dsd4wr";
        System.out.println(convertString(str1));
        System.out.println(convertString(str2));
        System.out.println(convertString(str3));
    }

    static String convertString(String str) {
        String concat =null;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++) {
            //char转换为String类型,再转换为Interger类型
            //
            if(Character.isDigit(str.charAt(i))){
                String temp = String.valueOf(str.charAt(i));
                for(int j=0; j<Integer.valueOf(temp)-1;j++) {
                    sb.append(str.charAt(i+1));
                }
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().replace("-", "@");
    }
}
