package com.code.designPatterns;
//define an interface or abstract class for creating an object but let the
// subclasses decide which class to instantiate.

abstract public class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
