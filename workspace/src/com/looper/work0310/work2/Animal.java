package com.looper.work0310.work2;

public abstract class Animal {

    protected String name;
    protected int healthValue;
    protected int relationship;

    public Animal() {
    }

    public Animal(String name, int healthValue, int relationship) {
        this.name = name;
        this.healthValue = healthValue;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getRelationship() {
        return relationship;
    }

    public void setRelationship(int relationship) {
        this.relationship = relationship;
    }

    public abstract void show();

}
