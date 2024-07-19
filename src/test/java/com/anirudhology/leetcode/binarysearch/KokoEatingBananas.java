package com.anirudhology.leetcode.binarysearch;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        // Special vase
        if (piles == null || piles.length == 0 || h <= 0) {
            return 0;
        }
        // Find maximum in the array
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        // Koko can eat minimum one banana and maximum "max" bananas
        int left = 1;
        int right = max;
        // Minimum rate
        int minRate = right;
        // Process the array in this range
        while (left <= right) {
            int currentRate = left + (right - left) / 2;
            int timeTaken = 0;
            for (int pile : piles) {
                timeTaken += (int) Math.ceil((double) pile / currentRate);
            }
            if (timeTaken <= h) {
                minRate = currentRate;
                right = currentRate - 1;
            } else {
                left = currentRate + 1;
            }
        }
        return minRate;
    }
}
