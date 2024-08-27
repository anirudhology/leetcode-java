package com.anirudhology.leetcode.math;

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        // Lengths of both the strings
        int m = num1.length();
        int n = num2.length();
        // Array to store product
        int[] product = new int[m + n - 1];
        // Process both the strings
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        // Process the final string
        for (int i = product.length - 1; i > 0; i--) {
            product[i - 1] += product[i] / 10;
            product[i] %= 10;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i : product) {
            sb.append(i);
        }
        return sb.toString();
    }
}
