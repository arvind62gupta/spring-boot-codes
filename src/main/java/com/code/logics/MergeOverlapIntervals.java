package com.code.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapIntervals {

    public static int[][] mergeIntervals(int[][] intervals){
        if(intervals==null || intervals.length==0) {
            return new int[0][];
        }
        //sort intervals by start time
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current =  intervals[0];

        for(int i=1 ; i< intervals.length;i++){
            //if overlapping merge them
            if(intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1] , intervals[i][1]);

            }else {
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current); // add last intervals

        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args){

        int[][] intervals = { {1, 3}, {2, 4}, {5, 8}, {15, 18} };

        int[][] result = mergeIntervals(intervals);
        System.out.println("Non-overlapping intervals after merging:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
