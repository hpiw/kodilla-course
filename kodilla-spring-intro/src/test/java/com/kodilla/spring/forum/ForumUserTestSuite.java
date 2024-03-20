package com.kodilla.spring.forum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ForumUserTestSuite {
    @Autowired
        private ForumUser forumUser;

    @Test
    @DisplayName("ForumUserTest")
    void  testUserName(){
        // Given

        // When

        // Then
        assertEquals("Circle", forumUser.getUsername());
    }
}