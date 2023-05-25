package com.hillel.dzhurynskyi.homework.hm20.strategy;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 10);
        calculator.setShape(rectangle);
        System.out.println("Area of rectangle: " + calculator.calculateArea());

        Triangle triangle = new Triangle(4, 6);
        calculator.setShape(triangle);
        System.out.println("Area of triangle: " + calculator.calculateArea());
    }
}
