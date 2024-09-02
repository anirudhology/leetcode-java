package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkDelayTimeTest {

    private final NetworkDelayTime networkDelayTime = new NetworkDelayTime();

    @Test
    public void testNetworkDelayTime_AllNodesReachable() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        assertEquals(2, networkDelayTime.networkDelayTime(times, n, k));
    }

    @Test
    public void testNetworkDelayTime_NotAllNodesReachable() {
        int[][] times = {{1, 2, 1}};
        int n = 2;
        int k = 2;
        assertEquals(-1, networkDelayTime.networkDelayTime(times, n, k));
    }

    @Test
    public void testNetworkDelayTime_SingleNode() {
        int[][] times = {};
        int n = 1;
        int k = 1;
        assertEquals(0, networkDelayTime.networkDelayTime(times, n, k));
    }

    @Test
    public void testNetworkDelayTime_DisconnectedGraph() {
        int[][] times = {{1, 2, 1}, {3, 4, 1}};
        int n = 4;
        int k = 1;
        assertEquals(-1, networkDelayTime.networkDelayTime(times, n, k));
    }

    @Test
    public void testNetworkDelayTime_SameNodeMultipleTimes() {
        int[][] times = {{1, 2, 1}, {1, 2, 2}};
        int n = 2;
        int k = 1;
        assertEquals(2, networkDelayTime.networkDelayTime(times, n, k));
    }

}