package com.hillel.dzhurynskyi.homework.hm23.adapter;

public class Sparrow implements Bird {
    // a concrete implementation of bird
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}