package com.code.jdk17Features;

sealed class Vehicle permits Car,Bike,Truck{

    public void printName(){
        System.out.println("Default");
    }
}

non-sealed class Car extends Vehicle {
    @Override
    public void printName() {
        System.out.println("Swift Ertiga");
    }
}
final  class Bike extends Vehicle {
    @Override
    public void printName() {
        System.out.println("Hero honda");
    }
}
non-sealed class Truck extends Vehicle {

    @Override
    public void printName() {
        System.out.println("Volvo");
    }
}

