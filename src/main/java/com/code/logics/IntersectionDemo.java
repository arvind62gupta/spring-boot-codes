package com.code.logics;

import java.util.*;

public class IntersectionDemo {
    public static void main(String[] args){

        int[] arr1 = {1,2,2,1,4,8};
        int[] arr2 = {3,2,2,1,4,1};

        int[] intersection = intersection(arr1, arr2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] arr1, int[] arr2){

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int j : arr1) {
            set1.add(j);
        }

        for (int j : arr2) {
            set2.add(j);
        }
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        int[] intersection = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            intersection[i++] = num;
        }
        return intersection;

    }
}
