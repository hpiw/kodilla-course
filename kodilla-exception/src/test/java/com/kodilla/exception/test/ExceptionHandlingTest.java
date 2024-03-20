package com.kodilla.exception.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    @BeforeAll
    static void setup() {
        System.out.println("Starting all tests.");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("All tests finished.");
    }

    @Test
    void additionalException() {


        //Given
        SecondChallenge challenge = new SecondChallenge();

        //When


        //Then
        assertThrows(Exception.class,(() -> challenge.probablyIWillThrowException(25,2.5)));

    }











        @Test
    void testProbablyIWillThrowExceptionWithValidParameters() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2));
    }

    @Test
    void testProbablyIWillThrowExceptionWithInvalidParameters() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }

    @Test
    void testProbablyIWillThrowExceptionWithBoundaryParameters() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5))
        );
    }
}
