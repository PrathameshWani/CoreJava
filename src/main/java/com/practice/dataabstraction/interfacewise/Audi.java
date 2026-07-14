package com.practice.dataabstraction.interfacewise;

public class Audi implements CarInterface {

    public static void main(String[] args) {
    	CarInterface car = new Audi();
    	car.applyBreak();
        car.start();
        car.stop();
    }

    @Override
    public void applyBreak() {
        System.out.println("IN APPLY BREAK IN AUDI");
    }

    @Override
    public void start(){
        System.out.println("START IN AUDI");

    }

    @Override
    public void stop(){
        System.out.println("STOP IN AUDI");
    }


}
