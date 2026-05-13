package com.code.logics;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args){
        String str = "geeksforgeeks";
        Set<Character> set = new HashSet<>();

        int left =0;
        int maxLength =0;
        for(int i=0;i<str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength,i - left + 1);
        }
        System.out.println(maxLength);

    }
}
