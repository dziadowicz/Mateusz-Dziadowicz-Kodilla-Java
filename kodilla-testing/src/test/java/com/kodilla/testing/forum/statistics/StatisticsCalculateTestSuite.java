package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculateTestSuite {
    @Mock
    Statistics statisticsMockEmpty;

    @Mock
    Statistics statisticsMock1000Posts100Users;

    @Mock
    Statistics statisticsMock1000posts999comments;

    @BeforeEach
    public void prepareMock() {
        List<String> userNamesMockEmpty = new ArrayList<>();
        List<String> userNames100 = new ArrayList<>();
        for (int n = 1; n <= 100; n++) {
            String userName = ("User" + n);
            userNames100.add(userName);
        }
        int postsCountMockEmpty = 0;
        int postsCountMock1000 = 1000;
        int commentsCountMockEmpty = 0;
        int commentsCountMock1001 = 1001;
        int commentsCountMock999 = 999;

        lenient().when(statisticsMockEmpty.usersNames()).thenReturn(userNamesMockEmpty);
        lenient().when(statisticsMockEmpty.postsCount()).thenReturn(postsCountMockEmpty);
        lenient().when(statisticsMockEmpty.commentsCount()).thenReturn(commentsCountMockEmpty);
        lenient().when(statisticsMock1000Posts100Users.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMock1000Posts100Users.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMock1000Posts100Users.commentsCount()).thenReturn(commentsCountMock1001);
        lenient().when(statisticsMock1000posts999comments.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMock1000posts999comments.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMock1000posts999comments.commentsCount()).thenReturn(commentsCountMock999);
    }

    @Test //0 posts, 0 comments, 0 users
    void testStatisticsCalculateAveragePostsPerUserWithNoPosts() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockEmpty);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(0, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerPost, 0.0001);
    }

    @Test //1000 posts, commentsQuantity > postsQuantity, 100 users
    void testStatisticsCalculate1000Posts() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock1000Posts100Users);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(10.01, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(1.001, averageCommentsPerPost, 0.0001);
    }

    @Test // postsQuantity > commentsQuantity
    void testStatisticsCalculateMorePostsThanComments() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock1000posts999comments);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(9.99, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0.999, averageCommentsPerPost, 0.0001);
    }
}
