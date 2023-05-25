package com.hillel.dzhurynskyi.homework.hm20.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V6")
                .setBody("SUV")
                .setTransmission("manual")
                .setColor("Black")
                .build();
        System.out.println(car);

    }
}
