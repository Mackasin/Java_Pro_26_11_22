package com.hillel.dzhurynskyi.homework.hm4.ex2.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Participant;

public class Human implements Participant {
    private final String name ;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int size) {
        return size <= 2000;
    }

    @Override
    public boolean jump(int size) {
        return size <= 2;
    }
    @Override
    public String toString() {
        return  name;
    }
}

