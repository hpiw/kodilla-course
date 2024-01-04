package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = List.of(
            new ForumUser(1, "xxxxx5", 'M', LocalDate.of(1992, 6, 15), 10),
            new ForumUser(2, "yyy3", 'M', LocalDate.of(2007, 8, 20), 3),
            new ForumUser(5, "yyy4", 'M', LocalDate.of(2004, 1, 5), 32),
            new ForumUser(3, "oooooooo8", 'F', LocalDate.of(1987, 1, 5), 7),
            new ForumUser(4, "fffffffff9", 'M', LocalDate.of(1993, 3, 6), 5));

    public List<ForumUser> getUserList() {
        return userList;
    }
}