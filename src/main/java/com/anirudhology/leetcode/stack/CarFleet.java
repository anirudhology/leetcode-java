package com.anirudhology.leetcode.stack;

import java.util.Arrays;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        // Special case
        if (target < 0 || position == null || position.length == 0 || speed == null || speed.length == 0) {
            return 0;
        }
        // Total number of cars
        int n = position.length;
        // Array to store the positions and time taken by that car
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (target - position[i]) * 1.0 / speed[i];
        }
        // Sort the cars by their positions in the descending order
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        // Last time registered
        double lastTime = 0;
        // Count of fleets
        int fleets = 0;
        // Process all the cars
        for (int i = 0; i < n; i++) {
            if (cars[i][1] > lastTime) {
                fleets++;
                lastTime = cars[i][1];
            }
        }
        return fleets;
    }
}
