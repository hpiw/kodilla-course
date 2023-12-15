package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionTestSuite {

    private OddNumbersExterminator exterminator;

    @BeforeEach
    public void before() {
        exterminator = new OddNumbersExterminator();
        System.out.println("Preparing test..");
    }

    @AfterEach
    public void after() {
        System.out.println("Test complete.");
    }

    @DisplayName("Testing empty list within exterminate() method")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        assertEquals(0, result.size());

    }

    @Test
    @DisplayName("Testing new list containing both odd and even numbers within exterminate() method")
    void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<Integer> result = exterminator.exterminate(numbers);

        // Then
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(expected, result);
    }
}
