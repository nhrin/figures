package Figures;

import DrawFigures.DrawCircle;

import java.awt.*;

public class Circle implements Figure {
    private double radius;
    private double pi = 3.14;
    private double circleLength;
    private Color color;
    private String name = "Circle";


    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
        this.circleLength = radius * 2 * pi;
    }

    public double getCircleLength() {
        return circleLength;
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
        return pi * (radius*radius);
    }

    @Override
    public void draw() {
        new DrawCircle(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        String name = "circle";

        return "area: " + Math.round(getArea()) + ", radius: " + Math.round(getRadius());
    }
}
