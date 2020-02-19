package com.jpeony.algorithm.precom;

/**
 * @author yihonglei
 */
public class PreCompile {
    public static void main(String[] args) {
        String[] arr = {"A1", "A2", "A3", "A4", "A5"};
        // 三人组
        for (int first = 0; first < arr.length; first++) {
            if (first + 1 == arr.length) {
                continue;
            }
            String one = arr[first];
            String two = arr[first + 1];
            for (int thr = first + 2; thr < arr.length; thr++) {
                String three = arr[thr];
                System.out.println("one=" + one + "two=" + two + "three=" + three);
            }
        }
        System.out.println("===================================");
        // 二人组
//        for (int first = 0; first < arr.length; first++) {
//            String one = arr[first];
//            for (int second = first + 1; second < arr.length; second++) {
//                String two = arr[second];
//                System.out.println("one=" + one + "two=" + two);
//            }
//        }
    }
}
