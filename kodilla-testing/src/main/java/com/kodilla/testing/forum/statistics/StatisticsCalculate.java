package com.kodilla.testing.forum.statistics;

public class StatisticsCalculate {

    private int numberOfUsers;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (numberOfUsers == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser = (double)postsNumber/numberOfUsers;
            averageCommentsPerUser = (double)commentsNumber/numberOfUsers;
        }

        if (postsNumber == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double)commentsNumber/postsNumber;
        }

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public String showStatistics() {

        String showStatistics = "Average posts per user = " + averagePostsPerUser + "\n Average comments per user = " + averageCommentsPerUser + "\n Average comments per post = " + averageCommentsPerPost;
        return showStatistics;
    }
}
