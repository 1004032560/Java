package com.looper.work0313.work3.domain;

public class Penguin {
    static final String SEX_MALE = "Q仔";
    static final String SEX_FEMALE = "Q妹";
    private String name;
    private int health;
    private int love;
    private String sex;

    public Penguin(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public Penguin() {
    }


    public void setSex(String sex) {
        if ("雄".equals(sex)){
            this.sex = SEX_MALE;
        }else if ("雌".equals(sex)){
            this.sex = SEX_FEMALE;
        }
    }

    @Override
    public String toString() {
        return "宠物的信息：" +
                "宠物姓名：'" + name + '\'' +
                ", 宠物健康值：" + health +
                ", 宠物的亲密度：" + love +
                ", 宠物的性别：'" + sex + '\'' +
                '}';
    }
}
