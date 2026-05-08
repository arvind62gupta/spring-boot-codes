package com.code.logics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindPairs {
    public static void main(String[] args){

//        String str=" Concept Of The java".replaceAll("\\s+", "").toLowerCase();
//        System.out.println(str);
        int[] arr = {0, -3, 4, -1, 2, 1};
        int target_sum = 5;

        int len = arr.length;
        //HashMap<Integer,Integer> hm = new HashMap<>();

        IntStream.range(0, arr.length)
                .forEach(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == target_sum)
                        .forEach(j -> System.out.println("(" + arr[i] + ", " + arr[j] + ")")));

// different code for different question
        //1. find sqare of number whose square is > 50
        List<Integer> integerList = Arrays.asList(2,4,8,9,10,12);
        List<Integer> result = integerList.stream().filter(num->(num*num)>50)
                .toList();
        System.out.println("element ===> "+result);
// find number start with 2 digit
        List<Integer> integerList1 = Arrays.asList(2343,4,8,28976,10,12);

        List<Integer> result1 = integerList1.stream()
                .filter(i->i.toString()
                        .startsWith(String
                                .valueOf(2))).toList();
        System.out.println("element ===> "+result1);

    }
}
