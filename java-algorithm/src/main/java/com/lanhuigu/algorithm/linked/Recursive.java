package com.lanhuigu.algorithm.linked;

/**
 * 递归
 *
 * @author yihonglei
 */
public class Recursive {

    /**
     * 循环打印
     */
    public static void recursivePrint(int i) {
        if (i > 0) {
            System.out.println(i);

            // 递归调用
            recursivePrint(i - 1);
        }
    }

    // Test
    public static void main(String[] args) {
        // 测试递归函数
        recursivePrint(2);
    }

}
