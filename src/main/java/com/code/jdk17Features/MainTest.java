package com.code.jdk17Features;

public class MainTest{
    public static void main(String[] args){

        Vehicle car=new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        car.printName();
        bike.printName();
        truck.printName();
    }
}