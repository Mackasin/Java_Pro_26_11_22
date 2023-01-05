package com.hillel.dzhurynskyi.homework.hm4.ex1.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex1.interfaces.Area;

public class Circle implements Area {
    private final double radius;
    private static final String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(name + " area is "+(double)Math.PI * radius * radius);
    }

}
