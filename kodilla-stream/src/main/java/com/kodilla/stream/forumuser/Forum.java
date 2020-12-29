package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private List<ForumUser> userList = new ArrayList<>();

    private void makeForumUserList() {
        userList.add(new ForumUser(1, "user1", 'F', LocalDate.of(1212, 12, 12), 13));
        userList.add(new ForumUser(2, "user2", 'F', LocalDate.of(1982, 11, 2), 2));
        userList.add(new ForumUser(3, "user3", 'M', LocalDate.of(1999, 2, 22), 0));
        userList.add(new ForumUser(4, "user4", 'M', LocalDate.of(2011, 6, 17), 0));
        userList.add(new ForumUser(5, "user5", 'F', LocalDate.of(2006, 7, 1), 120));
        userList.add(new ForumUser(6, "user6", 'M', LocalDate.of(1974, 3, 29), 0));
        userList.add(new ForumUser(7, "user7", 'M', LocalDate.of(1990, 12, 18), 6));
        userList.add(new ForumUser(8, "user8", 'F', LocalDate.of(2000, 12, 31), 100));
    }

    public List<ForumUser> getUserList() {
        makeForumUserList();
        return userList;
    }
}
