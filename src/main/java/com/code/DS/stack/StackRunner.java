package com.code.DS.stack;

//import java.util.Stack;

public class StackRunner {
    public static void main(String[] args){
       StackLearn nums= new StackLearn();
       nums.push(10);
       nums.push(8);
       nums.push(20);
       nums.push(12);

       nums.peek();
       nums.pop();
       nums.show();
    }
}
