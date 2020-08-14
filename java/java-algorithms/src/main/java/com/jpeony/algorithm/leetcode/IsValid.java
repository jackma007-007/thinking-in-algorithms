package com.jpeony.algorithm.leetcode;

import java.util.Stack;

/**
 * 【题源】https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author yihonglei
 */
public class IsValid {
    public static void main(String[] args) {
        String isValid = "()";
        System.out.println("isValid=" + isValid(isValid));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        // 符号栈
        Stack<Character> cStack = new Stack<>();
        // 左符号容器
        String leftContainer = "({[";
        // 转换为数组
        char[] cArr = s.toCharArray();
        for (char c : cArr) {
            // 入栈
            if (leftContainer.contains(String.valueOf(c))) {
                cStack.push(c);
            } else {
                // 第一次入栈是右括号，无法配对，返回false
                if (cStack.isEmpty()) {
                    return false;
                }
                // 出栈
                char peek = cStack.peek();
                if (('(' == peek && ')' == c) || ('{' == peek && '}' == c) || ('[' == peek && ']' == c)) {
                    cStack.pop();
                } else {
                    return false;
                }
            }
        }

        return cStack.isEmpty();
    }
}
