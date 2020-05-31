package com.jpeony.algorithm.leetcode;

import java.util.Stack;

/**
 * @author yihonglei
 */
public class SolutionReverse {

    private static int reverse1(int x) {
        int flag = x > 0 ? 1 : -1;

        x = Math.abs(x);

        int result = 0;
        while (x > 0) {
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            int pop = x % 10;
            result = result * 10 + pop;
            x = x / 10;

        }

        return result * flag;
    }


    /**
     * 严格校验，有bug
     */
    private static int reverse2(int x) {
        if (x == 0) {
            return 0;
        }
        // 正负标识
        int flag = x > 0 ? 1 : -1;
        // 原数字字符串
        int absX = Math.abs(x);
        String xStr = absX + "";
        Stack<String> container = new Stack<>();
        int length = xStr.length();
        // 入栈
        for (int i = 0; i < length; i++) {
            String tmp =  String.valueOf(xStr.charAt(i));
            if (i == (length - 1)) {
                if ("0".equals(tmp)) {
                    continue;
                }
            }

            container.add(tmp);
        }
        // 出栈
        // 反转后字符串
        StringBuilder newX = new StringBuilder();
        while (!container.isEmpty()) {
            newX.append(container.pop());
        }

        return Integer.parseInt(newX.toString()) * flag;
    }

    public static void main(String[] args) {
        System.out.println(reverse2(-1230));
    }
}