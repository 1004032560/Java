package com.looper.work0320.work06;

import java.util.Objects;

public class People {

    private int idCard;
    private String name;
    private int age;
    private String sex;
    private int weight;
    private String local;

    public People(int idCard, String name, int age, String sex, int weight, String local) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.local = local;
    }

    public People() {
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return idCard == people.idCard &&
                age == people.age &&
                weight == people.weight &&
                name.equals(people.name) &&
                sex.equals(people.sex) &&
                local.equals(people.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard, name, age, sex, weight, local);
    }
}
