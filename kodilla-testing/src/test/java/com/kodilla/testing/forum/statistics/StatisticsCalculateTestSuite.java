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
    Statistics statisticsMock1000Posts;

    @Mock
    Statistics statisticsMockNoPosts;

    @Mock
    Statistics statisticsMock100Users;

    @Mock
    Statistics statisticsMockNoComments;

    @Mock
    Statistics statisticsMockMorePostsThanComments;

    @Mock
    Statistics statisticsMockMoreCommentsThanPosts;

    @Mock
    Statistics statisticsMockNoUsers;

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

        lenient().when(statisticsMockNoPosts.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMockNoPosts.postsCount()).thenReturn(postsCountMockEmpty);
        lenient().when(statisticsMockNoPosts.commentsCount()).thenReturn(commentsCountMock999);
        lenient().when(statisticsMock1000Posts.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMock1000Posts.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMock1000Posts.commentsCount()).thenReturn(commentsCountMock999);
        lenient().when(statisticsMock100Users.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMock100Users.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMock100Users.commentsCount()).thenReturn(commentsCountMock999);
        lenient().when(statisticsMockNoComments.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMockNoComments.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMockNoComments.commentsCount()).thenReturn(commentsCountMockEmpty);
        lenient().when(statisticsMockMorePostsThanComments.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMockMorePostsThanComments.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMockMorePostsThanComments.commentsCount()).thenReturn(commentsCountMock999);
        lenient().when(statisticsMockMoreCommentsThanPosts.usersNames()).thenReturn(userNames100);
        lenient().when(statisticsMockMoreCommentsThanPosts.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMockMoreCommentsThanPosts.commentsCount()).thenReturn(commentsCountMock1001);
        lenient().when(statisticsMockNoUsers.usersNames()).thenReturn(userNamesMockEmpty);
        lenient().when(statisticsMockNoUsers.postsCount()).thenReturn(postsCountMock1000);
        lenient().when(statisticsMockNoUsers.commentsCount()).thenReturn(commentsCountMock999);
    }

    @Test //0 posts
    void testStatisticsCalculateAveragePostsPerUserWithNoPosts() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockNoPosts);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(0, numberOfPosts);
        Assertions.assertEquals(999, numberOfComments);
        Assertions.assertEquals(0, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(9.99, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerPost, 0.0001);
    }

    @Test //1000 posts
    void testStatisticsCalculateAveragePostsPerUserWith1000Posts() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock1000Posts);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(999, numberOfComments);
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(9.99, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0.999, averageCommentsPerPost, 0.0001);
    }

    @Test //100 users
    void testStatisticsCalculateAveragePostsPerUserWith100Users() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock100Users);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(999, numberOfComments);
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(9.99, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0.999, averageCommentsPerPost, 0.0001);
    }

    @Test //0 comments
    void testStatisticsCalculateAveragePostsPerUserWithNoComments() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockNoComments);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(0, numberOfComments);
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerPost, 0.0001);
    }

    @Test //comments < posts
    void testStatisticsCalculateAveragePostsPerUserWithMorePostsThanComments() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockMorePostsThanComments);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(999, numberOfComments);
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(9.99, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0.999, averageCommentsPerPost, 0.0001);
    }

    @Test //comments > posts
    void testStatisticsCalculateAveragePostsPerUserWithMoreCommentsThanPosts() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockMoreCommentsThanPosts);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(100, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(1001, numberOfComments);
        Assertions.assertEquals(10, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(10.01, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(1.001, averageCommentsPerPost, 0.0001);
    }

    @Test //0 users
    void testStatisticsCalculateAveragePostsPerUserWithNoUsers() {
        //Given
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMockNoUsers);

        //When
        double averagePostsPerUser = statisticsCalculate.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCalculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculate.getAverageCommentsPerPost();
        int numberOfUsers = statisticsCalculate.getNumberOfUsers();
        int numberOfPosts = statisticsCalculate.getPostsNumber();
        int numberOfComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assertions.assertEquals(0, numberOfUsers);
        Assertions.assertEquals(1000, numberOfPosts);
        Assertions.assertEquals(999, numberOfComments);
        Assertions.assertEquals(0, averagePostsPerUser, 0.0001);
        Assertions.assertEquals(0, averageCommentsPerUser, 0.0001);
        Assertions.assertEquals(0.999, averageCommentsPerPost, 0.0001);
    }

}
