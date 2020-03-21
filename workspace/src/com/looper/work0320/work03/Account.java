package com.looper.work0320.work03;

public class Account {

    private static int money = 10000;

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Account.money = money;
    }
}
