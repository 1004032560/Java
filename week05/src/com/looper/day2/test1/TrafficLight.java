package com.looper.day2.test1;

public class TrafficLight {
    //枚举类型数据
    private Signal color;

    public TrafficLight(Signal color) {
        this.color = color;

    }//信号灯变化的方法   红灯-绿灯-黄灯-红灯
    public void  change(){
        System.out.println("当前灯的颜色："+color);
        switch(color){
            case RED:
                color= Signal.GREEN;
                break;
            case GREEN:
                color=Signal.YELLOW;
                break;
            case YELLOW:
                color= Signal.RED;
        }
        System.out.println("下个灯的颜色："+color);
    }
}

