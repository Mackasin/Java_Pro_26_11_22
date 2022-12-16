package com.hillel.dzhurynskyi.homework.hm4.ex1;

import com.hillel.dzhurynskyi.homework.hm4.ex1.classes.Circle;
import com.hillel.dzhurynskyi.homework.hm4.ex1.classes.Quadrate;
import com.hillel.dzhurynskyi.homework.hm4.ex1.classes.Triangle;
import com.hillel.dzhurynskyi.homework.hm4.ex1.interfaces.Area;

public class Main {
    public static void main(String[] args) {

        Area[] array = new Area[3];
        array[0] = new Circle(10);
        array[1] = new Quadrate(10);
        array[2] = new Triangle(10, 5, 14);
        areaOfFigures(array);
    }

    static void areaOfFigures(Area[] array) {
        for (Area area : array) area.area();
    }
}
