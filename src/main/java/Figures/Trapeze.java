package Figures;

import DrawFigures.DrawTrapeze;
import DrawFigures.DrawTriangle;

import java.awt.*;

public class Trapeze implements Figure {
    private double sideA;
    private double sideB;
    private double h;
    private Color color;
    private String name = "Trapeze";


    public Trapeze(double sideA, double sideB, double h, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.h = h;
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
        return (sideA + sideB) / 2 * h;
    }

    @Override
    public void draw() {
        new DrawTrapeze(color);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getH() {
        return h;
    }

    @Override
    public String toString() {
        return "area: " + Math.round(getArea()) + ", side A: " + Math.round(getSideA()) +
                ", side B: " + Math.round(getSideB()) + ", height: " + Math.round(getH());
    }
}
