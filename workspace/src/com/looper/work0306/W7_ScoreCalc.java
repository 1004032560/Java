package com.looper.work0306;

public class W7_ScoreCalc {

    private int c;
    private int java;
    private int vb;

    public W7_ScoreCalc(int c, int java, int vb) {
        this.c = c;
        this.java = java;
        this.vb = vb;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getVb() {
        return vb;
    }

    public void setVb(int vb) {
        this.vb = vb;
    }

    public int add(){
        int sum = c + java + vb;
        return sum;
    }

    public double avg(){
        double avg = this.add()/3;
        return avg;
    }

}
