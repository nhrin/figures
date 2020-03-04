package Figures;

import DrawFigures.DrawTriangle;

import java.awt.*;

public class RightTriangle implements Figure {
    private double sideA;
    private double sideB;
    private Color color;
    private String name = "RightTriangle";
    private double hypotenuse;

    public RightTriangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
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
        return sideB * sideA / 2;
    }

    @Override
    public void draw() {
        new DrawTriangle(color);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public String toString() {
        return "area: " + Math.round(getArea()) + ", hypotenuse: " + Math.round(getHypotenuse()) + ", cathet1: " +
                Math.round(getSideA()) + ", cathet2: " + Math.round(getSideB());
    }
}
