package com.looper.work0319.work03;

import java.util.Random;

public class Computer {

    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int showFist() {
        // 产生随机数
        int show = (int) (Math.random() * 10) % 3 + 1; // 产生随机数，表示电脑出拳
        switch (show) {
            case 1:
                System.out.println(name + "出拳: 剪刀");
                break;
            case 2:
                System.out.println(name + "出拳: 石头");
                break;
            case 3:
                System.out.println(name + "出拳: 布");
                break;
        }
        return show;
    }

}
