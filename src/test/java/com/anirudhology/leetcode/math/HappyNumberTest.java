package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    private final HappyNumber happyNumber = new HappyNumber();

    @Test
    public void testIsHappy() {
        // Test happy numbers
        assertTrue(happyNumber.isHappy(1));
        assertTrue(happyNumber.isHappy(7));
        assertTrue(happyNumber.isHappy(19));

        // Test unhappy numbers
        assertFalse(happyNumber.isHappy(2));
        assertFalse(happyNumber.isHappy(4));
        assertFalse(happyNumber.isHappy(20));

        // Test number with multiple digits that is not happy
        assertFalse(happyNumber.isHappy(21));
    }
}