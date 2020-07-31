package com.jpeony.algorithm.precom;

import java.util.*;

/**
 * @author yihonglei
 */
public class CombinationTest {
    public static Stack<String> stack = new Stack<>();
    public static List<String> carPoolingResult = new ArrayList<>();

    public static void main(String[] args) {
        List<String> orders = new ArrayList();
        orders.add("A1");
        orders.add("A2");
        orders.add("A3");
        orders.add("A4");
        orders.add("A5");
        orders.add("A6");

        // 从这个数组4个数中选择三个
        carPoolingRecursion(orders, 3, 0, 0, carPoolingResult);
        System.out.println(carPoolingResult);
    }

    /**
     * @param orders           元素
     * @param target           要选多少个元素
     * @param size             当前有多少个元素
     * @param currentIndex     当前选到的下标
     * @param carPoolingResult 组合
     */
    private static void carPoolingRecursion(List orders, int target, int size, int currentIndex, List<String> carPoolingResult) {
        if (size == target) {
            System.out.println(stack);
            carPoolingResult.add(stack.toString());
            return;
        }

        for (int i = currentIndex; i < orders.size(); i++) {
            if (!stack.contains(orders.get(i).toString())) {
                stack.add(orders.get(i).toString());
                carPoolingRecursion(orders, target, size + 1, i, carPoolingResult);
                stack.pop();
            }
        }
    }
}
