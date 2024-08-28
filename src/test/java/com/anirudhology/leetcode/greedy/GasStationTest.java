package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasStationTest {

    private final GasStation gasStation = new GasStation();

    @Test
    void testCanCompleteCircuitBasic() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        assertEquals(3, gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    void testCanCompleteCircuitNoSolution() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 5};
        assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    void testCanCompleteCircuitSingleStation() {
        int[] gas = {5};
        int[] cost = {4};
        assertEquals(0, gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    void testCanCompleteCircuitAllStationsEqual() {
        int[] gas = {1, 1, 1, 1};
        int[] cost = {1, 1, 1, 1};
        assertEquals(0, gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    void testCanCompleteCircuitMultipleSolutions() {
        int[] gas = {2, 3, 4};
        int[] cost = {2, 1, 2};
        assertEquals(0, gasStation.canCompleteCircuit(gas, cost));  // Multiple valid start points, returns the first
    }
}