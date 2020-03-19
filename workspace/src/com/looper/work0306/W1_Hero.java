package com.looper.work0306;

public class W1_Hero {

    private int exp;
    private int leave;
    private int att;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int attach(W1_Monster w1Monster){

        int hp = w1Monster.getHp() - att;

        return hp;

    }

}
