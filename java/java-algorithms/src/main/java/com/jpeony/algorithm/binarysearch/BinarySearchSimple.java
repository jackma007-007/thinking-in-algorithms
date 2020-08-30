package com.jpeony.algorithm.binarysearch;

/**
 * 简单二分查找算法。
 *
 * @author yihonglei
 */
public class BinarySearchSimple {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 目标元素
        int target = 4;
        // 目标元素下标位置
        int index = -1;
        // 低位
        int low = 0;
        // 高位
        int high = arr.length - 1;
        // 中间位
        int mid = (low + high) / 2;

        while (true) {
            // 查找到目标元素，中间位置为目标元素
            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                // 如果中间元素大于目标元素，则目标元素在左半段，high = mid - 1
                if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    // 如果中间元素小于目标元素，则目标元素在右半段，low = mid + 1
                    low = mid + 1;
                }

                mid = (low + high) / 2;
            }
        }

        System.out.println("index = " + index);
    }
}
