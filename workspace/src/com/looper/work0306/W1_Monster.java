package com.looper.work0306;

public class W1_Monster {


    private int leave;
    private int hp;

    public W1_Monster(int hp, int leave){
        this.hp = hp;
        this.leave = leave;
    }

    public W1_Monster(){}

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int live(){

        int xue = leave * 1000;

        return xue;
    }

}
