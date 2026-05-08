package com.code.logics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertIntToInteger {

    public static void main(String[] args){

        //find the repeating elements
       int[] intArray={1,10,8,9,12,0,1,9};

           List<Integer> list= Arrays.stream(intArray).boxed().toList();
        System.out.println(list);

        Map<Integer,Long> frequencyElements=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("frequencyElements === "+frequencyElements);

        List<Integer> duplicatesElements=  list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))

                .entrySet().stream().filter(i->i.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("duplicatesElements using groupBy=== "+duplicatesElements);

        HashSet<Integer> set= new HashSet<Integer>();
         Set<Integer> result=list.stream().filter(i->!set.add(i))
                .collect(Collectors.toSet());

        System.out.println("duplicatesElements using SET=== "+result);



    }
}
