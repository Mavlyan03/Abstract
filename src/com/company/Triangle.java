package com.company;

public class Triangle extends Shape {
    private double length;
    private double length2;
    private double breadth;

    public Triangle (int length,int breadth,int length2) {
        this.length = length;
        this.breadth = breadth;
        this.length2 = length2;
    }
    public double getPerimeter() {
        return length + breadth + length2;
    }
}
