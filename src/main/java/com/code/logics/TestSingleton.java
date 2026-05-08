package com.code.logics;

public class TestSingleton {
// lazy initialization
    private static TestSingleton obj= null;
    private TestSingleton() {

        System.out.println("Inside TestSingleton");
    }
   // this is nt thread safe
    public static TestSingleton getInstance() {
        if(obj == null) {
            obj=new TestSingleton();

        }
        return obj;
    }
    public  static void test() {
        System.out.println("singleton is created");
    }
}
