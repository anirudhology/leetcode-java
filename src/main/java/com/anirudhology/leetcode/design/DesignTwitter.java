package com.anirudhology.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class DesignTwitter {

    static class Twitter {
        private final Map<Integer, List<Integer>> userTweets;
        private final Map<Integer, Set<Integer>> userFollowing;
        private final Map<Integer, Integer> tweets;
        private int timestamp;

        public Twitter() {
            this.userTweets = new HashMap<>();
            this.userFollowing = new HashMap<>();
            this.tweets = new HashMap<>();
            this.timestamp = 0;
        }

        public void postTweet(int userId, int tweetId) {
            userTweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(tweetId);
            tweets.put(tweetId, ++timestamp);
        }

        public List<Integer> getNewsFeed(int userId) {
            Set<Integer> following = userFollowing.getOrDefault(userId, new HashSet<>());
            Set<Integer> users = new HashSet<>(following);
            users.add(userId);
            Queue<Integer> maxHeap = new PriorityQueue<>(10, (a, b) -> (tweets.get(b) - tweets.get(a)));
            for (Integer user : users) {
                List<Integer> tweets = userTweets.get(user);
                if (tweets != null && !tweets.isEmpty()) {
                    for (int i = tweets.size() - 1, k = 10; i >= 0 && k > 0; --i, --k) {
                        maxHeap.offer(tweets.get(i));
                    }
                }
            }
            final List<Integer> newsFeed = new ArrayList<>();
            while (!maxHeap.isEmpty() && newsFeed.size() < 10) {
                newsFeed.add(maxHeap.poll());
            }
            return newsFeed;
        }

        public void follow(int followerId, int followeeId) {
            userFollowing.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            userFollowing.computeIfAbsent(followerId, k -> new HashSet<>()).remove(followeeId);
        }
    }
}
