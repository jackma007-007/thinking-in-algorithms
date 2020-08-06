package com.jpeony.algorithm.linked;

/**
 * 递归打印斐波那契数列第N项值
 *
 * @author yihonglei
 */
public class Fibonacci {
    /**
     * 打印斐波那契数列第N项值
     */
    public static int fabonacci(int i) {
        // 前两项规定为1，即如果是前两项，直接返回1
        if (i == 1 || i == 2) {
            return 1;
        } else {
            // 其余项均为前两项之和，fabonacci(i - 1)：当前项的前一项， f abonacci(i - 2)：当前项的前前一项
            return fabonacci(i - 1) + fabonacci(i - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fabonacci(6));
    }

}
