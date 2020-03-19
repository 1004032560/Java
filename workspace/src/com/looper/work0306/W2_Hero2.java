package com.looper.work0306;

public class W2_Hero2 {

    private int leave;
    private int exp;

    public W2_Hero2(){}

    public W2_Hero2(int leave){
        this.leave = leave;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    public int calculateExp(){

        int j = 30*(leave*leave*leave+3*leave)-80;

        return j;
    }

}
