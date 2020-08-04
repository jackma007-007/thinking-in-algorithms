package com.jpeony.algorithm.sorts;

import java.util.Arrays;

/**
 * 冒泡排序算法。
 *
 * @author yihonglei
 */
public class BubbleSort {

    /**
     * 冒泡排序算法
     */
    public static void bubbleSort(int[] arr) {
        // 控制需要比较多少轮，取出的元素跟后续元素比较
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("===第" + i + "轮");
            // 控制比较的次数，比较过的将不再比较，即每次冒一个泡，冒上来的下次就不参与比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前一个数比后一个数大，需要进行交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("第" + j + "次比较后结果：" + Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        // 创建数组
        int[] arr = {2, 5, 4, 1, 3};
        // 排序前的数组
        System.out.println("排序前的数组：" + Arrays.toString(arr));
        // 排序算法
        bubbleSort(arr);
        // 排序后的数组
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }
    
}
