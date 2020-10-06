package com.jpeony.algorithm.sorts;

/**
 * 快速排序
 *
 * @author yihonglei
 */

import java.util.Arrays;

/**
 * 快速排序算法
 *
 * @author yihonglei
 */
public class QuickSort {
    /**
     * 快速排序算法
     *
     * @param arr   排序数组
     * @param start 排序数组中起始位置
     * @param end   排序数组中结束位置
     * @author yihonglei
     */
    public static void quickSort(int[] arr, int start, int end) {
        // 开始与结束之间有元素才需要排序，否则，不排序
        if (start < end) {
            // 把数组中的第0个元素作为标准元素
            int standard = arr[start];

            // 记录需要排序的下标
            int low = start;
            int high = end;

            // 循环查找比标准元素大的数和比标准元素小的数
            while (low < high) {
                // 右边的数字比标准数大，元素不需要替换，直接将高位下标移到前一位
                while (low < high && arr[high] >= standard) {
                    high--;
                }
                // 使用右边的数字替换掉左边的数字
                arr[low] = arr[high];

                // 如果左边的数字比标准数小，元素不需要替换，直接将低位下标移到后一位
                while (low < high && arr[low] <= standard) {
                    low++;
                }
                // 使用左边的数字替换掉右边的数字
                arr[high] = arr[low];
            }

            // 如果高低位重合时，把标准数赋值给低位所在位置的元素
            arr[low] = standard;
            // 打印每一轮递归后的结果
            System.out.println("递归结果：" + Arrays.toString(arr));
            // 递归处理所有比标准数小的部分
            quickSort(arr, start, low);
            // 递归处理所有比标准数大的部分
            quickSort(arr, low + 1, end);
        }
    }

    public static void main(String[] args) {
        // 定义数组
        int[] arr = {3, 1, 2, 5, 4, 8};
        // 打印排序前的数组
        System.out.println("排序前的数组：" + Arrays.toString(arr));

        // 调用排序方法
        quickSort(arr, 0, arr.length - 1);
        // 打印排序后的数组
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
}
