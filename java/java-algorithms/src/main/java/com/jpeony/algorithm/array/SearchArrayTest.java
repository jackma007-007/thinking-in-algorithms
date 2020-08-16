package com.jpeony.algorithm.array;

/**
 * 基于数组的线性查找。
 *
 * @author yihonglei
 */
public class SearchArrayTest {

    public static void main(String[] args) {
        // 定义数组
        int[] arr = {2, 4, 9, 8, 3, 6, 7};
        // 目标元素
        int target = 9;
        // 目标元素的下标，默认为-1，表示没有找到元素
        int index = -1;
        // 查找目标元素，返回目标元素的下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        // 打印目标元素的下标
        System.out.println("index：" + index);
    }

}
