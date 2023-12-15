package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(1, "xxxxx5", 'M', LocalDate.of(1992, 6, 15), 10));
        userList.add(new ForumUser(2, "yyy3", 'M', LocalDate.of(2007, 8, 20), 3));
        userList.add(new ForumUser(3, "oooooooo8", 'F', LocalDate.of(1987, 1, 5), 7));
        userList.add(new ForumUser(4, "fffffffff9", 'M', LocalDate.of(1993, 3, 6), 5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}