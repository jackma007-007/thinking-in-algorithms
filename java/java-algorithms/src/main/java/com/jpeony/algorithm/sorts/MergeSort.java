package com.jpeony.algorithm.sorts;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author yihonglei
 */
public class MergeSort {
    public static int[] sort(int[] sourceArray) {
        // 复制一份
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        // 如果数组只有一个元素，没有排序的意义，退出排序
        if (arr.length < 2) {
            return arr;
        }
        // 中位数（arr.length >> 1 简单等价于 arr.length/2）
        int middle = (int) Math.floor(arr.length >> 1);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        // 分治递归
        return merge(sort(left), sort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0, len = 0;
        while (len < left.length + right.length) {
            if (left[l] <= right[r]) {
                result[len++] = left[l++];

                if (l == left.length) {
                    for (int i = r; i < right.length; i++) {
                        result[len++] = right[r++];
                    }
                }
            } else {
                result[len++] = right[r++];

                if (r == right.length) {
                    for (int i = l; i < left.length; i++) {
                        result[len++] = left[l++];
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3};
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        int[] arrNew = sort(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arrNew));
    }
}
