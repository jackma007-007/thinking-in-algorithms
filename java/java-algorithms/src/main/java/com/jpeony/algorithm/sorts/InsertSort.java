package com.jpeony.algorithm.sorts;

import java.util.Arrays;

/**
 * 插入排序算法。
 *
 * @author yihonglei
 */
public class InsertSort {
    /**
     * 插入排序算法
     */
    public static void insertSort(int[] arr) {
        // 遍历所有的数字
        for (int i = 1; i < arr.length; i++) {
            // 把当前元素取出来
            int tmp = arr[i];
            // 如果当前数字小于前一个数字
            if (tmp < arr[i - 1]) {
                int j = 0;
                // 遍历比当前元素小的前面所有数字，如果前面数字小于当前元素，则不在遍历
                for (j = i - 1; j >= 0 && tmp < arr[j]; j--) {
                    // 大数往后移动一个位置
                    arr[j + 1] = arr[j];
                }
                // 当tmp比前一个数大时
                arr[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2, 8};
        System.out.println("排序前数组：" + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序后数组：" + Arrays.toString(arr));
    }

}
