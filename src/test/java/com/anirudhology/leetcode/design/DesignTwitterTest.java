package com.anirudhology.leetcode.design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DesignTwitterTest {

    private DesignTwitter.Twitter twitter;

    @BeforeEach
    public void setUp() {
        twitter = new DesignTwitter.Twitter();
    }

    @Test
    public void testPostTweet() {
        twitter.postTweet(1, 101);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(1, feed.size());
        assertEquals(101, feed.get(0));
    }

    @Test
    public void testGetNewsFeed() {
        twitter.postTweet(1, 101);
        twitter.postTweet(2, 102);
        twitter.follow(1, 2);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(2, feed.size());
        assertEquals(102, feed.get(0));
        assertEquals(101, feed.get(1));
    }

    @Test
    public void testFollowUnfollow() {
        twitter.postTweet(1, 101);
        twitter.postTweet(2, 102);
        twitter.follow(1, 2);
        List<Integer> feed = twitter.getNewsFeed(1);
        assertEquals(2, feed.size());
        assertEquals(102, feed.get(0));
        twitter.unfollow(1, 2);
        feed = twitter.getNewsFeed(1);
        assertEquals(1, feed.size());
        assertEquals(101, feed.get(0));
    }

}