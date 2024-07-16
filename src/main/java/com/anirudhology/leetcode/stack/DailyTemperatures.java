package com.anirudhology.leetcode.stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // Special case
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        // Length of the array
        int n = temperatures.length;
        // Answer array
        final int[] answer = new int[n];
        // Stack to store the indices of elements
        final int[] stack = new int[n];
        // Top of the stack
        int top = -1;
        // Process the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Since we are moving from right to left, the next
            // greater element will be at the top of the stack
            // and we can consider it
            while (top > -1 && temperatures[i] >= temperatures[stack[top]]) {
                top--;
            }
            // If the stack is not empty at this time, it means we have next greater
            // element represented by the top, and we can find the distance between
            // current index and top
            if (top > -1) {
                answer[i] = stack[top] - i;
            }
            // Insert current index
            top++;
            stack[top] = i;
        }
        return answer;
    }
}
