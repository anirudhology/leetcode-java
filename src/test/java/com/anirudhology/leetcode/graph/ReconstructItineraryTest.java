package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReconstructItineraryTest {

    private final ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

    @Test
    public void testFindItinerary() {
        // Test case 1
        List<List<String>> tickets1 = new ArrayList<>();
        tickets1.add(Arrays.asList("MUC", "LHR"));
        tickets1.add(Arrays.asList("JFK", "MUC"));
        tickets1.add(Arrays.asList("SFO", "SJC"));
        tickets1.add(Arrays.asList("LHR", "SFO"));

        List<String> expected1 = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");
        assertEquals(expected1, reconstructItinerary.findItinerary(tickets1));

        // Test case 2
        List<List<String>> tickets2 = new ArrayList<>();
        tickets2.add(Arrays.asList("JFK", "SFO"));
        tickets2.add(Arrays.asList("JFK", "ATL"));
        tickets2.add(Arrays.asList("SFO", "ATL"));
        tickets2.add(Arrays.asList("ATL", "JFK"));
        tickets2.add(Arrays.asList("ATL", "SFO"));

        List<String> expected2 = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        assertEquals(expected2, reconstructItinerary.findItinerary(tickets2));
    }
}