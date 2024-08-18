package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsIITest {

    private final MeetingRoomsII meetingRoomsII = new MeetingRoomsII();

    @Test
    void testMinMeetingRooms() {
        // Test case: Overlapping intervals
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        assertEquals(2, meetingRoomsII.minMeetingRooms(intervals1));

        // Test case: Non-overlapping intervals
        int[][] intervals2 = {{7, 10}, {2, 4}};
        assertEquals(1, meetingRoomsII.minMeetingRooms(intervals2));

        // Test case: Single interval
        int[][] intervals3 = {{1, 5}};
        assertEquals(1, meetingRoomsII.minMeetingRooms(intervals3));

        // Test case: Empty intervals array
        int[][] intervals4 = {};
        assertEquals(0, meetingRoomsII.minMeetingRooms(intervals4));

        // Test case: Null intervals array
        assertEquals(0, meetingRoomsII.minMeetingRooms(null));

        // Test case: Multiple meetings at the same time
        int[][] intervals6 = {{1, 10}, {1, 10}, {1, 10}};
        assertEquals(3, meetingRoomsII.minMeetingRooms(intervals6));
    }
}