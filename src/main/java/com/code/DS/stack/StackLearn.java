package com.code.DS.stack;

public class StackLearn {

    int[] arr1 = new int[5];
    int top = 0;
    public void push(int data) {

        arr1[top] =data;
        top++;
    }
    public  void pop(){
        int data;
        top--;
        data = arr1[top];
        arr1[top] = 0;
        System.out.println("deleted data ===> "+data +" ");
    }
    public void peek(){
        int data;
        data = arr1[top-1];
        System.out.println("peek data ===> "+data +" ");
    }
    public void show(){

        for(int n : arr1){
            System.out.println(n+ " ");
        }
    }
}
