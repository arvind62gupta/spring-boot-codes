package com.code.logics;

public class Main {
    public static void main(String[] args) {

        TestSingleton.getInstance().test();
        Java8ProgramTest test=new Java8ProgramTest();
        test.highestElements();
        test.frequencyOfElements();
        test.startWithDigit();
        test.sumOfArrayOfElements();
        test.firstRepeatedChar();
        test.lastNotDuplicatedChar();
        test.removeDuplicatesCharacter();
        test.removeDuplicatesCharacterUsingCoreJAVA();
        test.reverseString();
        test.removeDuplicatesDigit();
        test.sumOfDigits();
        test.oddEvenNumber();
        test.addDigitsFromAlphaNumeric();
        test.convertStringToUpperCase();
        test.matchingElements();
        test.mergeArraysElements();


       // Superclass obj = new Subclass();

       // obj.foo();

      
    }


}
