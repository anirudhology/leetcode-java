package com.anirudhology.leetcode.intervals;

import java.util.Arrays;

public class MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // Total number of meetings
        int n = intervals.length;
        // Separate all start and end times
        final int[] startTimes = new int[n];
        final int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
        // Sort both arrays
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        // Total number of meetings required
        int requiredMeetingRooms = 0;
        // Meetings in progress currently
        int meetingsInProgress = 0;
        // Pointers to keep track of start times and end times
        int start = 0;
        int end = 0;
        while (start < n) {
            if (startTimes[start] < endTimes[end]) {
                start++;
                meetingsInProgress++;
            } else {
                meetingsInProgress--;
                end++;
            }
            requiredMeetingRooms = Math.max(requiredMeetingRooms, meetingsInProgress);
        }
        return requiredMeetingRooms;
    }
}
