package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.gender() == 'M')
                .filter(user -> Period.between(user.dateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.postCount() >= 1)
                .collect(Collectors.toMap(ForumUser::userId, user -> user));

        resultMap.forEach((id, user) -> System.out.println("UserID: " + id + ", " + user.username()));
    }
}