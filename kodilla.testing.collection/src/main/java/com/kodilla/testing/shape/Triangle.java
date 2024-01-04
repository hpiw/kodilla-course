package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
       return 0.5 * base * height;
    }
}
