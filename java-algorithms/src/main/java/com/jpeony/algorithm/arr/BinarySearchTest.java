package com.jpeony.algorithm.arr;

/**
 * 二分法在有序数组中查找目标元素。
 *
 * @author yihonglei
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        // 目标数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 目标元素
        int target = 3;

        // 目标元素下标位置，默认为-1，表示没有查找到元素
        int index = -1;

        // 记录开始位置
        int begin = 0;

        // 记录结束位置
        int end = arr.length - 1;

        // 记录中间位置
        int mid = (end + begin) / 2;

        // 循环查找
        while (true) {
            // 当首位置大于等于结束位置，说明没有元素
            if (begin >= end) {
                break;
            }
            // 如果中间位置元素为目标元素，直接中断循环，返回目标元素的位置
            if (arr[mid] == target) {
                index = mid;
                break;
            } else { // 如果中间位置元素不是目标元素，则需要对数组进行分半查找
                if (arr[mid] > target) {
                    // 如果中间位置元素大于目标元素，则说明目标元素在左半段，
                    // 哪么end的位置就为mid-1
                    end = mid - 1;
                } else {
                    // 如果中间位置元素小于目标元素，则说明目标元素在右半段，
                    // 哪么begin位置就为mid+1
                    begin = mid + 1;
                }

                // 计算新的mid位置
                mid = (end + begin) / 2;
            }
        }

        // 打印目标元素的下标位置
        System.out.println("index：" + index);
    }
}
