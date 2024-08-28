package com.anirudhology.leetcode.greedy;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Local effective fuel - fuel when start from current index
        int localFuel = 0;
        // Global effective fuel - total fuel that is left after the journey
        int globalFuel = 0;
        // Index at which we start
        int index = 0;
        // Process the array and check for every index as the start index
        for (int i = 0; i < gas.length; i++) {
            localFuel += gas[i] - cost[i];
            globalFuel += gas[i] - cost[i];
            // Check if we have insufficient fuel
            if (localFuel < 0) {
                localFuel = 0;
                index = i + 1;
            }
        }
        return globalFuel >= 0 ? index : -1;
    }
}
