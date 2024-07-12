package com.anirudhology.leetcode.string;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Process the string from both ends
        while (left <= right) {
            if (isNotAlphanumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if (isNotAlphanumeric(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isNotAlphanumeric(char c) {
        return (c < 'a' || c > 'z')
                && (c < 'A' || c > 'Z')
                && (c < '0' || c > '9');
    }
}
