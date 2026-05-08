package com.code.substrings;

public class LongestSubStringLogic {
    public int lengthOfLongestSubString(String s){
        int len =s.length();
        int maxLength =0 ;
        for(int i=0; i < len ; i++){
            for(int j=i+1; j <= len ;j++){
                if(findUnique(s,i,j)){
                    maxLength=Math.max(maxLength,j-i); // Update the maximum length if the substring is unique

                }
            }

        }
        return maxLength; // Return the maximum length of the substring

    }

    private boolean findUnique(String s, int start,int end){

        for(int i=start;i<end-1;i++){
            for(int j=i+1;j<end;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;// Return false if any characters are repeated
                }
            }
        }
        return true;// Return true if all characters are unique
    }
}
