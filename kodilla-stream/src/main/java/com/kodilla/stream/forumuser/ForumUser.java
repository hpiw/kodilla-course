package com.kodilla.stream.forumuser;



import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(int userId, String username, char gender, LocalDate dateOfBirth, int postCount) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getUserId() { return userId; }

    public String getUsername() { return username; }

    public char getGender() { return gender; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int getPostCount() { return postCount; }
}