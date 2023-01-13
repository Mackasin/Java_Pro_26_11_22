package com.hillel.dzhurynskyi.homework.hm12;


public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"a", "b", "c", "d", "e"};
        Double[] arr3 = {1.0, 3.5, 4.6, 10.8, 9.9};

        ToList toList1 = new ToList();

        System.out.println(toList1.toList(arr1));
        System.out.println(toList1.toList(arr2));
        System.out.println(toList1.toList(arr3));

        Box<Orange> box1 = new Box<>(new Orange());
        Box<Apple> box2 = new Box<>(new Apple());
        Box<Orange> box3 = new Box<>(new Orange());
        Box<Apple> box4 = new Box<>(new Apple());

        box1.addOneFruit();
        box1.addOneFruit();
        box2.addManyFruits(15);
        box3.addManyFruits(16);
        box4.addOneFruit();
        box4.addOneFruit();
        box4.addOneFruit();

        System.out.println(box1.getAmount());
        System.out.println(box1.getWeight());
        System.out.println();
        System.out.println(box2.getAmount());
        System.out.println(box2.getWeight());
        System.out.println();
        System.out.println(box3.getAmount());
        System.out.println(box3.getWeight());
        System.out.println();
        System.out.println(box4.getAmount());
        System.out.println(box4.getWeight());
        System.out.println();
        System.out.println(box1.compare(box4));
        System.out.println();
        System.out.println(box3.compare(box4));
        System.out.println();
        System.out.println(box1.merge(box3));
        System.out.println();
        System.out.println(box1.getAmount());
        System.out.println(box1.getWeight());
        System.out.println();
        System.out.println(box3.getAmount());
        System.out.println(box3.getWeight());
        System.out.println();
        System.out.println(box1.merge(box2));
    }
}
