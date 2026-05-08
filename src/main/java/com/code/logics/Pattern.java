package com.code.logics;

public class Pattern {

    public static void main(String[] args){

        for (int i = 0; i < 9; i++) {

            for (int j = 9 - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
