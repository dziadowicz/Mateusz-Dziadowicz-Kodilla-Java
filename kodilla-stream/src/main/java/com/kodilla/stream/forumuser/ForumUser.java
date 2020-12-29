package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postsNumber;

    public ForumUser(int userID, String userName, char sex, LocalDate birthDay, int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iserID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
