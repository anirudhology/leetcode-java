package com.anirudhology.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoIntegersTest {

    private final SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    public void testGetSumBothPositive() {
        assertEquals(5, sumOfTwoIntegers.getSum(2, 3));
    }

    @Test
    public void testGetSumOnePositiveOneNegative() {
        assertEquals(1, sumOfTwoIntegers.getSum(3, -2));
    }

    @Test
    public void testGetSumBothNegative() {
        assertEquals(-5, sumOfTwoIntegers.getSum(-2, -3));
    }

    @Test
    public void testGetSumFirstZero() {
        assertEquals(4, sumOfTwoIntegers.getSum(0, 4));
    }

    @Test
    public void testGetSumSecondZero() {
        assertEquals(-4, sumOfTwoIntegers.getSum(-4, 0));
    }

    @Test
    public void testGetSumBothZero() {
        assertEquals(0, sumOfTwoIntegers.getSum(0, 0));
    }
}
