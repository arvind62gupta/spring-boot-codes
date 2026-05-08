package com.code.logics;

public class Subclass extends Superclass {

    @Override

    public void foo() throws RuntimeException {

        throw new RuntimeException("RuntimeException in Subclass");

    }

}
