package com.jpeony.algorithm.leetcode;

/**
 * @author yihonglei
 */
public class SolutionMyAtoi {

    private static int myAtoiRef(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        int ans = 0, len = 0, n = str.length();
        boolean isNegative = false;
        int i = 0;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            isNegative = (str.charAt(0) == '-');
            i++;
        }
        // pass over leading 0s
        while (i < n && str.charAt(i) == '0') {
            i++;
        }

        for (i = i; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            if (len == 9) {
                if (isNegative) {
                    if (ans > -(Integer.MIN_VALUE / 10) ||
                            (ans == -(Integer.MIN_VALUE / 10) && c - '0' >= 8)) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (ans > Integer.MAX_VALUE / 10 ||
                            (ans == (Integer.MAX_VALUE / 10) && c - '0' >= 7)) {
                        return Integer.MAX_VALUE;
                    }
                }
            }
            if (len == 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + c - '0';
            len++;
        }

        return isNegative ? -ans : ans;
    }

    private static int myAtoi(String str) {
        int flag = 1;
        StringBuilder finalStr = new StringBuilder();
        String trimStr = str.replace("\"", "").trim();
        for (int i = 0; i < trimStr.length(); i++) {
            char tmpChar = trimStr.charAt(i);
            String tmpStr = String.valueOf(tmpChar);
            if (tmpStr.equals("-")) {
                finalStr.append(tmpStr);
                flag = -1;
                continue;
            }

            if (tmpStr.equals("+")) {
                finalStr.append(tmpStr);
                flag = 1;
                continue;
            }

            if (finalStr.toString().contains("+-") || finalStr.toString().contains("-+")) {
                return 0;
            }

            if (Character.isDigit(tmpChar)) {
                finalStr.append(tmpStr);
                if (i == (trimStr.length() - 1)) {
                    long longTmp = Long.parseLong(finalStr.toString());
                    long longAbs = Math.abs(longTmp);
                    if (longAbs > Integer.MAX_VALUE) {
                        return (Integer.MAX_VALUE + 1) * flag;
                    }
                    return Integer.parseInt(finalStr.toString());
                }
            } else {
                if (i == 1) {
                    return Integer.parseInt(finalStr.toString());
                }

                if ("".equals(finalStr.toString())) {
                    return 0;
                }

                long longTmp = Long.parseLong(finalStr.toString());
                long longAbs = Math.abs(longTmp);
                if (longAbs > Integer.MAX_VALUE) {
                    return (Integer.MAX_VALUE + 1) * flag;
                }
                return Integer.parseInt(finalStr.toString());
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String test = "-2147483648";
        System.out.println(myAtoi(test));
        System.out.println(myAtoiRef(test));
    }
}
