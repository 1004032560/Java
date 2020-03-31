package com.looper.day2.test6;

import java.util.Observable;

/**
 * 被观察者类
 */
public class BGC extends Observable {

    private int num = 0;
    public void setNum(int num){
        //判断数据是否发生变化
        if (this.num!=num){
            this.num = num;
            //设置变化
            setChanged();

            notifyObservers();
        }
    }

    public int getNum(){
        return num;
    }

}
