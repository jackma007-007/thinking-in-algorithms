package com.jpeony.algorithm.stack;

import java.util.Stack;

/**
 * Java Stack常用方法
 *
 * @author yihonglei
 */
public class StackMethod {
    public static void main(String[] args) {
        Stack<String> staffs = new Stack<String>();
        // 入栈顺序: a,b,c,d,e
        staffs.push("a");
        staffs.push("b");
        staffs.push("c");
        staffs.push("d");
        staffs.push("e");

        System.out.println("empty():" + staffs.empty());
        System.out.println("peek():" + staffs.peek());
        System.out.println("search(Object o):" + staffs.search("a"));
        System.out.println("search(Object o):" + staffs.search("e"));
        System.out.println("search(Object o):" + staffs.search("no"));

        // 出栈顺序: e,d,c,b,a
        while (!staffs.isEmpty()) {
            System.out.print(staffs.pop() + " ");
        }

        System.out.println("=====空栈中使用方法=======");
        System.out.println("empty():" + staffs.empty());
        //System.out.println("peek():" + staffs.peek());// 在空栈中使用时报错，因为没有栈顶元素
        System.out.println("search(Object o):" + staffs.search("a"));
        System.out.println("search(Object o):" + staffs.search("e"));
        System.out.println("search(Object o):" + staffs.search("no"));
        //System.out.print(staffs.pop());// 空栈中移除栈顶元素，报错
    }
}