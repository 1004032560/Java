package com.looper.day1.test4;

public class House<E> {

    private String type;
    private String address;
    //桌子或者床
    private E e;

    public House(String type, String address,E e) {
        this.type = type;
        this.address = address;
        this.e = e;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", e=" + e +
                '}';
    }
}
