package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> shapes;
    private static double staticSquare = 2;
    private double square = 2;

    public ShapeCollector() {
        this.shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        this.shapes.add(shape);
    }


    public boolean removeFigure(Shape shape) {
        return this.shapes.remove(shape);
    }
//ToDo test dla indeksu nieistniejacego w kolekcji figur
    public Shape getFigure(int n) {
        if (n >= 0 && n < this.shapes.size()) {
            return this.shapes.get(n);
        }
        return null;
    }
    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (Shape shape : this.shapes) {
            result.append(shape.getShapeName()).append(", ");
        }

        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    public int getShapesQuantity() {
        return this.shapes.size();
    }
}
