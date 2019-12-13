package com.lanhuigu.algorithm.linked;

/**
 * 递归解决汉诺塔问题
 *
 * @author yihonglei
 */
public class Hanoi {
    public static void main(String[] args) {
        hanoi(2, "A", "B", "C");
    }

    /**
     * 汉诺塔问题
     *
     * @param n    盘子数量
     * @param from 启始柱子
     * @param in   中间柱子
     * @param to   目标柱子
     * @author yihonglei
     */
    public static void hanoi(int n, String from, String in, String to) {
        // 只有一个盘子
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移到" + to);
            // 无论有多少个盘子，都认为只有两个。上面的所有盘子和最下面的一个盘子。
        } else {
            // 移动上面所有的盘子到中间位置
            hanoi(n - 1, from, to, in);
            // 移动下面的盘子
            System.out.println("第" + n + "个盘子从" + from + "移到" + to);
            // 把上面的所有盘子从中间位置移到目标位置
            hanoi(n - 1, in, from, to);
        }
    }
}
