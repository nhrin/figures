package Figures;

import DrawFigures.DrawSquare;

import java.awt.*;

public class Square implements Figure {
    private Double sideLength;
    private Color color;
    private String name = "Square";


    public Square (Double sideLength, Color color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        new DrawSquare(color);
    }

    public Double getSideLength() {
        return sideLength;
    }

    @Override
    public String toString() {
        String name = "square";

        return "area: " + Math.round(getArea()) + ", side length: " + Math.round(getSideLength());
    }
}
