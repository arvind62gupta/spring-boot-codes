package com.code.jdk17Features;

public class SingletonDemo {

    private static  SingletonDemo s;
    private SingletonDemo(){
        }
        public static synchronized SingletonDemo getInstance(){
            if(s==null) {
                s = new SingletonDemo();
            }
            return s;
        }



}
