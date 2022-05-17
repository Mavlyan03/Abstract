package com.company;

public class Main {

    public static void main(String[] args) {
      Square square = new Square(5,5,5,5);
      System.out.println("Perimeter of square is: " + (int)square.getPerimeter());

      Circle circle = new Circle(15);
      System.out.println("Perimeter of circle is: " + circle.getPerimeter());

      Trapezoid trapezoid = new Trapezoid(8,12,10,12);
      System.out.println("Perimeter of trapezoid is: " + (int)trapezoid.getPerimeter());

      Rectangle rectangle = new Rectangle(16,8,16,8);
      System.out.println("Perimeter of rectangle is: " + (int)rectangle.getPerimeter());

      Triangle triangle = new Triangle(11,9,11);
      System.out.println("Perimeter of triangle is: " + (int)triangle.getPerimeter());



    }
}
