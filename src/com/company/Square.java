package com.company;

public class Square extends Shape {
    private double length;
    private double breadth;
    private double length2;
    private double breadth2;

    public Square (int length,int breadth,int length2,int breadth2) {
        this.length = length;
        this.breadth = breadth;
        this.length2 = length2;
        this.breadth2 = breadth2;
    }
    @Override
    public double getPerimeter() {
        return length + breadth + length2 + breadth2;
    }

}
