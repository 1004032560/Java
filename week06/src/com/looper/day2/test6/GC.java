package com.looper.day2.test6;

import java.util.Observable;
import java.util.Observer;

public class GC implements Observer {

    //构造方法中，观察者和被观察的对象绑定在一起
    public GC(BGC bgc){
        bgc.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        //向下造型
        BGC bgc = (BGC)o;
        System.out.println("数据的变化是："+((BGC) o).getNum());
    }
}
