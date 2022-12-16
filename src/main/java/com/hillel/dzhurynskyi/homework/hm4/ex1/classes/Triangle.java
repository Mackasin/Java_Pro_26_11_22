package com.hillel.dzhurynskyi.homework.hm4.ex1.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex1.interfaces.Area;

public class Triangle implements Area {
    private final double side1;
    private final double side2;
    private final double side3;
    private static final String name = "Triangle";

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void area() {
        double p = (side1 + side2 + side3) / 2;
        System.out.println(name + " area is "+ Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }
}
