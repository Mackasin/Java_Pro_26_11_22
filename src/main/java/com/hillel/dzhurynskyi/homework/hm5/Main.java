package com.hillel.dzhurynskyi.homework.hm5;

import com.hillel.dzhurynskyi.homework.hm5.animal.Animal;
import com.hillel.dzhurynskyi.homework.hm5.cat.Cat;
import com.hillel.dzhurynskyi.homework.hm5.dog.Dog;


public class Main {
    public static void main(String[] args) {

        Dog bobik = new Dog("bobik");
        Dog topik = new Dog("topik");
        Cat murchik = new Cat("Murchik");
        Cat mur = new Cat("Mur");

        topik.run(250);
        topik.swim(9);
        System.out.println();
        bobik.run(501);
        bobik.swim(15);
        System.out.println();
        murchik.run(150);
        murchik.swim(150);
        System.out.println();
        mur.run(250);
        mur.swim(0);

        System.out.println("\nnumber of animals: " + Animal.getCount());
        System.out.println("number of cats: " + Cat.getCount1());
        System.out.println("number of dogs: " + Dog.getCount2());
    }
}
