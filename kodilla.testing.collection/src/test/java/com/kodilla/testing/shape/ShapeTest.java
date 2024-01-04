package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {



    @Test
    @DisplayName("Testing get shape name for Circle")
    void getShapeNameForCircle() {
        // Given
        Shape circle = new Circle(2);
        // When
        String result = circle.getShapeName();
        // Then
        assertEquals("Circle", result);
    }
    @Test
    @DisplayName("Testing get shape name for Triangle")
    void getShapeNameForTriangle() {
        // Given
        Shape Triangle = new Triangle(2 ,2);
        // When
        String result = Triangle.getShapeName();
        // Then
        assertEquals("Triangle", result);
    }
    @Test
    @DisplayName("Testing get shape name for Square")
    void getShapeNameForSquare() {
        // Given
        Shape Square = new Square(2);
        // When
        String result = Square.getShapeName();
        // Then
        assertEquals("Square", result);
    }

    @Test
    @DisplayName("Testing getField for Circle")
    void getFieldForCircle() {
        //Given
        Shape Circle = new Circle(2);
        //When
        Double result = Circle.getField();
        // Then
        assertEquals(12.56, result);

    }

    @Test
    @DisplayName("Testing getField for Square")
    void getFieldForSquare() {
        //Given
        Shape Square = new Square(2);
        //When
        Double result = Square.getField();
        // Then
        assertEquals(4, result);

    }

    @Test
    @DisplayName("Testing getField for Triangle")
    void getFieldForTriangle() {
        // Given
        Shape Triangle = new Triangle(2 ,2);
        // When
        double result = Triangle.getField();
        // Then
        assertEquals(2, result);

    }

    @Test
    @DisplayName("Testing add, remove, get figures for only one shape collector")
    void testFigures() {
        // Given
        Shape circle = new Circle(2);
        Shape triangle = new Triangle(2, 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        ShapeCollector shapeCollector2 = new ShapeCollector();

        // When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        String twoFigures = shapeCollector.showFigures();
        shapeCollector.removeFigure(triangle);

        // Then
        assertEquals(1, shapeCollector.getShapesQuantity());
        assertEquals("Circle", shapeCollector.showFigures());
        assertEquals("Circle, Triangle", twoFigures);
        assertEquals("Circle", shapeCollector.getFigure(0).getShapeName());
        assertEquals(0, shapeCollector2.getShapesQuantity());
    }
}