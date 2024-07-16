package com.anirudhology.leetcode.stack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarFleetTest {
    
    private final CarFleet carFleet = new CarFleet();
    
    @Test
    public void testCarFleetEmptyPosition() {
        int target = 10;
        int[] position = {};
        int[] speed = {};
        int expected = 0;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetNullPosition() {
        int target = 10;
        int expected = 0;
        int result = carFleet.carFleet(target, null, null);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetSingleCar() {
        int target = 10;
        int[] position = {3};
        int[] speed = {3};
        int expected = 1;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetMultipleCars() {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        int expected = 3;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetNoFleets() {
        int target = 10;
        int[] position = {8, 6, 4, 2};
        int[] speed = {1, 1, 1, 1};
        int expected = 4;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetAllCarsTogether() {
        int target = 10;
        int[] position = {3, 5, 7};
        int[] speed = {1, 2, 3};
        int expected = 3;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetDifferentSpeeds() {
        int target = 12;
        int[] position = {3, 6, 9};
        int[] speed = {3, 2, 1};
        int expected = 1;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }

    @Test
    public void testCarFleetNegativeTarget() {
        int target = -10;
        int[] position = {3, 6, 9};
        int[] speed = {3, 2, 1};
        int expected = 0;
        int result = carFleet.carFleet(target, position, speed);
        assertEquals(expected, result);
    }
}