package com.looper.day1.test4;

public class FXTest2 {

    public static void main(String[] args) {
        Person2 person = new Person2();
        System.out.println(person);

        Person2 person1 = new Person2(1001,"whj",new House("别墅","北京","bed"));
        System.out.println(person1);

        Object object = person1.getObject();

        if (object instanceof House){
            System.out.println(object);
        }else{
            System.out.println("不是House");
        }

        System.out.println("================================");
        Person2 person2 = new Person2(1002,"jkl",new Car("123456","奔驰"));
        System.out.println(person2);


    }

}
