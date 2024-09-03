package com.anirudhology.leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReconstructItinerary {

    public List<String> findItinerary(List<List<String>> tickets) {
        // Since we need to return the path in lexical order, we will
        // use minHeap to store airports. Thus, we need a map that will
        // connect the departure and arrival airports
        final Map<String, Queue<String>> flights = new HashMap<>();
        // List to store the final path
        final LinkedList<String> path = new LinkedList<>();
        // Process all flights to create the mappings
        for (List<String> ticket : tickets) {
            final String departure = ticket.get(0);
            final String arrival = ticket.get(1);
            flights.putIfAbsent(departure, new PriorityQueue<>());
            flights.get(departure).offer(arrival);
        }
        // We start from JFK, hence we will perform DFS from there
        dfs("JFK", flights, path);
        return path;
    }

    private void dfs(String departureAirport, Map<String, Queue<String>> flights, LinkedList<String> path) {
        // Get arrival airports for the given departure airport
        Queue<String> arrivalAirports = flights.get(departureAirport);
        while (arrivalAirports != null &&!arrivalAirports.isEmpty()) {
            dfs(arrivalAirports.remove(), flights, path);
        }
        path.addFirst(departureAirport);
    }
}
