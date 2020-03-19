package com.looper.work0317.work04;

public class StudentTest1 {

    public static void main(String[] args) {

        String str = "#01#张三#20@02#李四#30@03#王五#40";

        String[] splits1 = str.split("@");

        Student student1 = new Student();

        for (String split1 : splits1) {

            String[] splits2 = split1.split("#");

            for (int i=0;i<splits2.length;i++) {

                String[] split = new String[splits2.length];
                split[i] = splits2[i].trim();

                if (i==0){
                    System.out.println(i);
                }else{
                    student1.setId(split[i]);
                    student1.setName(split[i]);
                    student1.setScore(split[i]);
                }
            }
        }

        student1.show();



    }

}
