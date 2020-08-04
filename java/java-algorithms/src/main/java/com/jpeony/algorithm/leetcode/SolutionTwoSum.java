package com.jpeony.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author yihonglei
 */
public class SolutionTwoSum {
    private int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int e1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int e2 = nums[j];
                int t = e1 + e2;
                if (t == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] intResult = solutionTwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(intResult));
    }
}
