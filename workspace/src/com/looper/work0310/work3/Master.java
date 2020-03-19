package com.looper.work0310.work3;


public class Master {
    private String masterName;
    public void feed(Pet pet,Food food){
        System.out.println("饲养员:"+masterName+"喂了"+pet.getPetName()+"吃了"+food.getFoodName());
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
}