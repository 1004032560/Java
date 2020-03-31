package com.looper.work0331.work02;

import java.util.Observable;
import java.util.Observer;

public class GC implements Observer {

    public GC(BGC bgc){
        bgc.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        //向下造型
        BGC bgc = (BGC)o;
        System.out.println("观察者观察到的数据变化是："+bgc.getNum());
    }
}
