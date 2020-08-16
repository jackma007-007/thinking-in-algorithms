package com.jpeony.algorithm.array;

/**
 * 二分法在有序数组中查找目标元素。
 * 【使用前提】
 * 该算法的使用前提必须基于有序表使用
 * 【算法思想】
 * 因为数组元素是有序的，每次查找从中间分段，比较中间元素是否是目标元素，
 * 如果不是，则根据目标元素与中间元素比较结果，看是基于前半段查找还是后半段查找。
 * 不断重复此过程，直到找到目标元素为止。
 * 【算法优点】
 * 查找效率高，不需要像线性查找一样挨个元素比较，二分查找能减少比较次数。
 * 【算法缺点】
 * 应用面比较窄，因为要基于有序表才能使用二分查找。
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
