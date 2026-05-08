package com.code.substrings;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args){

       // String input = "abcdxyzxb";
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter any string");
        String input= sc.nextLine();
        System.out.println("You have entered: "+input);
        // method call
        LongestSubStringLogic longestSubStringLogic = new LongestSubStringLogic();
        int result = longestSubStringLogic.lengthOfLongestSubString(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);

    }

}
