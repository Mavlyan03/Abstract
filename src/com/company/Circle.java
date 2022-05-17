package com.company;

public class Circle extends Shape {
    private final static double pi = Math.PI;
    private static double radius;
    public Circle (double radius) {
        if (radius < 0) {
            System.out.println("Radius is too little: " + radius);
        }
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return  2 * radius * pi ;
    }
}
