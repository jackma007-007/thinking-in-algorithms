package com.lanhuigu.algorithm.stack;

import java.util.Stack;

/**
 * 如何仅用递归函数和栈操作逆序一个栈
 *
 * @author yihonglei
 */
public class ReverseStack {

    /**
     * 将栈低元素返回并移除
     *
     * @author yihonglei
     */
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();

        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(last);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }

        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

}
