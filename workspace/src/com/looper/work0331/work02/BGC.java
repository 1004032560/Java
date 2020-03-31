package com.looper.work0331.work02;

import java.util.Observable;
import java.util.Observer;

public class BGC extends Observable {
    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {

        if (this.num!=num){
            this.num = num;
            //设置变化
            setChanged();
            //通知观察者
            notifyObservers();
        }

    }
}
