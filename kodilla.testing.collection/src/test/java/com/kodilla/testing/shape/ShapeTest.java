package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getShapeName() {
        // Given
        Shape circle = new Circle();
        // When
        String result = circle.getShapeName();
        // Then
        assertEquals("Circle", result);
    }

    @Test
    void getField() {
    }
    public void testAddFigure() {
        // Given
        Shape shape = new Circle();

        // When
        ShapeCollector.addFigure(shape);

        // Then
        assertEquals(1, ShapeCollector.getShapesQuantity());
    }
}