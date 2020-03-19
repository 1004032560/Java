package com.looper.work0306;

public class W4_Box {

    private int length;
    private int width;
    private int height;
    private int volume;

    public W4_Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int calcVolume(){
        volume = length * width * height;
        return volume;
    }

    public void print(){
        System.out.println("体积的值为："+volume);
    }

}
