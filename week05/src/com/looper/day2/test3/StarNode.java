package com.looper.day2.test3;

public class StarNode {

    private int id;
    private String name;
    private StarNode next;

    public StarNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StarNode getNext() {
        return next;
    }

    public void setNext(StarNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StarNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
