package com.looper.day1.test5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//public class Student implements Serializable {
public class Student implements Externalizable {
    //生成serialVersionUID
    //private static final long serialVersionUID = -1006740765571824975L;
    private int id;
    private String name;
    private int age;
    private String address;
    //private transient String address;//敏感  方式 1
    private Course course;//关联类也是要序列化

    public Student() {
    }
    /*    //方式2
    private void writeObject(ObjectOutputStream oos) throws IOException {
        //oos.defaultWriteObject();
        System.out.println("序列化时候调用。。。");
        //自定义序列化规则
        oos.writeUTF(name);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        //ois.defaultReadObject();
        System.out.println("反序列化时候调用。。。");
        //自定义反序列化规则
        name =  ois.readUTF();
    }*/

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(int id, String name, int age, String address, Course course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("自定义的反序列化方法被调用");
        name = in.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("自定义的序列化方法被调用");
        out.writeUTF(name);
    }

}