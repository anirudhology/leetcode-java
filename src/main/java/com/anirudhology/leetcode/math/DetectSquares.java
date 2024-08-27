package com.anirudhology.leetcode.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetectSquares {

    private final List<int[]> coordinates;
    private final Map<String, Integer> frequencies;

    public DetectSquares() {
        this.coordinates = new ArrayList<>();
        this.frequencies = new HashMap<>();
    }

    public void add(int[] point) {
        final String key = point[0] + "," + point[1];
        coordinates.add(point);
        frequencies.put(key, frequencies.getOrDefault(key, 0) + 1);
    }

    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int sum = 0;
        for (int[] coordinate : coordinates) {
            int px = coordinate[0];
            int py = coordinate[1];
            // Consider this point only if it makes a square
            if (Math.abs(px - x) == Math.abs(py - y)&& px != x && py != y) {
                sum += frequencies.getOrDefault(x + "," + py, 0)
                        * frequencies.getOrDefault(px + "," + y, 0);
            }
        }
        return sum;
    }
}
