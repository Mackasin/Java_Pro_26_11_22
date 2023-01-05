package com.hillel.dzhurynskyi.homework.hm4.ex1.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex1.interfaces.Area;

public class Quadrate implements Area {
    private final double side;
    private static final String name = "Quadrate";

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(name + " area is "+side*side);
    }
}
