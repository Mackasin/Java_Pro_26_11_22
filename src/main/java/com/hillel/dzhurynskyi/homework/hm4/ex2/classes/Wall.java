package com.hillel.dzhurynskyi.homework.hm4.ex2.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Obstacle;
import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Participant;

public class Wall implements Obstacle {
    private static final String name = "wall";
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }

    @Override
    public String toString() {
        return name;
    }
}
