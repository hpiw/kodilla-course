package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public record ForumUser(int userId, String username, char gender, LocalDate dateOfBirth, int postCount) { }