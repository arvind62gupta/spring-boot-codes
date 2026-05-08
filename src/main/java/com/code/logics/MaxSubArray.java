package com.code.logics;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 7, 8};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        } return maxSoFar;
    }
}
