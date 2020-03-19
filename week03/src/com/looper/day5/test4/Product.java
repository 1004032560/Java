package com.looper.day5.test4;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private double price;
    private int num;

    public Product() {
    }

    public Product(int id, String name, double price, int num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "商品编号= " + id +
               ", 商品名称= " + name +
               ", 商品价格= " + price +
               ", 商品数量= " + num ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                num == product.num &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, num);
    }
}
