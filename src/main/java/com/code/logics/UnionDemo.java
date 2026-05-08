package com.code.logics;

public class UnionDemo {

    public static void main(String[] args) {

        int[] arr1 = {1,4,8,3,4,9};
        int[] arr2 = {3,2,4,5,6};

        int l1= arr1.length;
        int l2= arr2.length;

        int i=0; int j=0;
        while(i<l1 && j<l2){
            if(arr1[i]< arr2[j]){
                System.out.print(arr1[i++]+" ");

            } else if (arr1[i]>arr2[j]) {
                System.out.print(arr2[j++]+ " ");
            }else {
                System.out.print(arr1[i++]+" ");
                j++;
            }

        }
        while(i<l1){
            System.out.print(arr1[i++]+" ");
        }
        while(j<l2){
            System.out.print(arr2[j++]+" ");
        }
    }
}
