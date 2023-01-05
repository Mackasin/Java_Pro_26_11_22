package com.hillel.dzhurynskyi.homework.hm4.ex2.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Participant;

public class Cat implements Participant {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int size) {
        return size <= 3000;
    }

    @Override
    public boolean jump(int size) {
        return size <= 1;
    }

    @Override
    public String toString() {
        return  name;
    }
}
