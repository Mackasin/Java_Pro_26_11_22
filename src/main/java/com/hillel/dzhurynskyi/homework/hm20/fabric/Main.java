package com.hillel.dzhurynskyi.homework.hm20.fabric;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory=new FurnitureFactory();

        factory.furnitureCreate(FurnitureType.CHAIR).create();
        factory.furnitureCreate(FurnitureType.TABLE).create();
        factory.furnitureCreate(FurnitureType.BED).create();
    }
}
