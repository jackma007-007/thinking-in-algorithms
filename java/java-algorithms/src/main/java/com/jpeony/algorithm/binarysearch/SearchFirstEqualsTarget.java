package com.jpeony.algorithm.binarysearch;

/**
 * 二分查找变体1：查找第一个值等于给定值的元素。
 *
 * @author yihonglei
 */
public class SearchFirstEqualsTarget {
    public static void main(String[] args) {
        // 查找数组
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9};
        // 目标元素
        int target = 3;
        // 目标元素的下标位置，默认-1
        int index = -1;
        // 低位
        int low = 0;
        // 高位
        int high = arr.length - 1;

        // 查找第一个值等于给定值的元素
        while (true) {
            // 中位
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != target) {
                    index = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("target-index=" + index);
    }
}
