package com.code.logics;

import java.util.Arrays;

public class ShiftRotation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length;
        int shift = 2;

        int[] temp = new int[len];
        System.out.println("length====>  "+len);
        for(int i=0;i<len; i++){
            temp[i] =  arr[(i+len - shift) % len];
        }
        System.out.println(Arrays.toString(temp));
    }
}
