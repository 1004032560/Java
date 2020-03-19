package com.looper.work0317.work04;

public class StudentTest {

        public static void main(String[] args) {
            String str = "#01#张三#20@02#李四#30@03#王五#40";
            String str1 = str.substring(1);
            String strs[] =  new String[3];
            Student student = new Student();
            String[] split = str1.split("@");

            for (String s:split){
                String[] split1 = s.split("#");
                int index = 0;

                System.out.println(split1.length);
                for (String s1:split1){
                    strs[index] = s1;
                    index++;
                }
                student.setId(strs[0]);
                student.setName(strs[1]);
                student.setScore(strs[2]);
                student.show();
            }
        }
}
