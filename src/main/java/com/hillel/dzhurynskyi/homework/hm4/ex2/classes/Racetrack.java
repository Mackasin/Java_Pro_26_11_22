package com.hillel.dzhurynskyi.homework.hm4.ex2.classes;

import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Obstacle;
import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Participant;


public class Racetrack implements Obstacle {
    private static final String name = "racetrack";
    private final int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
//        participant.run(length);
        return participant.run(length);
    }


    @Override
    public String toString() {
        return name;
    }
}
