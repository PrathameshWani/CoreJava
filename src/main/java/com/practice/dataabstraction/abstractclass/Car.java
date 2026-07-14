package com.practice.dataabstraction.abstractclass;

public abstract class Car {

    int milege;

    Car(int milege){
        this.milege = milege;
    }

    public abstract void start();
    public abstract void applyBreak();
    public abstract void stop();

    public int getMilege() {
        return milege;
    }


}
