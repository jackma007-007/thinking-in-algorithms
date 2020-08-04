package com.jpeony.algorithm.stack;

import java.util.Stack;

/**
 * 入栈 出栈
 *
 * @author yihonglei
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> staffs = new Stack<>();

        // 入栈顺序: a,b,c,d,e
        staffs.push("a");
        staffs.push("b");
        staffs.push("c");
        staffs.push("d");
        staffs.push("e");

        // 出栈顺序: e,d,c,b,a
        while (!staffs.isEmpty()) {
            System.out.print(staffs.pop() + " ");
        }
    }
}