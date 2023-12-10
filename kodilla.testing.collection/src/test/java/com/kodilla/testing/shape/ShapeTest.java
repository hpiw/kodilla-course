package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getShapeName() {
        // Given
        Shape rectangle = new Rectangle();
        // When
        String result = rectangle.getShapeName();
        // Then
        assertEquals("Rectangle", result);
    }

    @Test
    void getField() {
    }
}