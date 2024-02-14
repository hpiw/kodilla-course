package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        forumStatistics = new ForumStatistics();
    }

    private void prepareMockData(int users, int posts, int comments) {
        when(statisticsMock.usersNames()).thenReturn(Collections.nCopies(users, "User"));
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }


    @Test
    void testCalculateAdvStatisticsWithZeroPosts() {
        prepareMockData(10, 0, 30);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, forumStatistics.getAvgPostsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsWithThousandPosts() {
        prepareMockData(10, 1000, 500);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(100, forumStatistics.getAvgPostsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsWithZeroComments() {
        prepareMockData(10, 20, 0);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThanComments() {
        prepareMockData(10, 100, 50);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertTrue(forumStatistics.getAvgCommentsPerPost() < 1);
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        prepareMockData(10, 50, 100);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertTrue(forumStatistics.getAvgCommentsPerPost() > 1);
    }

    @Test
    void testCalculateAdvStatisticsWithZeroUsers() {
        prepareMockData(0, 100, 100);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, forumStatistics.getAvgPostsPerUser());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWithHundredUsers() {
        prepareMockData(100, 100, 100);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(1, forumStatistics.getAvgPostsPerUser());
        assertEquals(1, forumStatistics.getAvgCommentsPerUser());
    }
}