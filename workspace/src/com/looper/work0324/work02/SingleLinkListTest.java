package com.looper.work0324.work02;

public class SingleLinkListTest {

    public static void main(String[] args) {

        SingleLinkList singleLinkList = new SingleLinkList();

        Student student1 = new Student(1001,"蔡徐坤");
        Student student2 = new Student(1002,"孙笑川");
        Student student3 = new Student(1003,"李云龙");

        singleLinkList.add(student1);
        singleLinkList.add(student2);
        singleLinkList.add(student3);

        singleLinkList.list();

        singleLinkList.findById(1003);

        singleLinkList.deleteById(1003);

        singleLinkList.list();
    }

}
