package com.practice.dataabstraction.abstractclass;

public class Audi extends LuxuryCar{

    @Override
    public void start(){

    }

    @Override
    public void applyBreak() {

    }
    @Override
    public void stop(){

    }

    @Override
    public void data(){

    }

    public static void main(String[] args) {

        //
        //Car a = new Car();  We can do this & do below thing as well, where we can store the object of child class in parent class reference.

        LuxuryCar a = new Audi();
        a.applyBreak();
        a.stop();
        a.start();
        System.out.println(a.getMilege());



    }

}
