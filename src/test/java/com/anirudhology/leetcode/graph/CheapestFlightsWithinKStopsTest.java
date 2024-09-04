package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheapestFlightsWithinKStopsTest {

    private final CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();

    @Test
    public void testBasicScenario() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(200, result);
    }

    @Test
    public void testNoAvailableFlight() {
        int n = 3;
        int[][] flights = {{0, 1, 100}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(-1, result);
    }

    @Test
    public void testDirectFlight() {
        int n = 3;
        int[][] flights = {{0, 2, 300}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(300, result);
    }

    @Test
    public void testNoStopAllowed() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 0;
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(500, result);
    }

    @Test
    public void testLargeKValue() {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 3, 100}, {0, 3, 500}};
        int src = 0;
        int dst = 3;
        int k = 2;
        int result = cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(300, result);
    }
}