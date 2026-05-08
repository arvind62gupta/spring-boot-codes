package com.code.logics;

public class EagerSingleton {
    //eager initialization
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {

        System.out.println("EagerSingleton instantiated");
    }
    // this is thread safe
    public static EagerSingleton getInstance(){
        return instance;
    }
}
