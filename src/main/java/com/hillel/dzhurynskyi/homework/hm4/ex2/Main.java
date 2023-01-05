package com.hillel.dzhurynskyi.homework.hm4.ex2;

import com.hillel.dzhurynskyi.homework.hm4.ex2.classes.*;
import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Obstacle;
import com.hillel.dzhurynskyi.homework.hm4.ex2.interfaces.Participant;

public class Main {

    public static void main(String[] args) {
        int k;
        Participant[] participant = new Participant[]{new Cat("Murchik"), new Robot("Vally"), new Human("Maksym")};
        Obstacle[] obstacles = new Obstacle[]{new Wall(1), new Racetrack(350), new Racetrack(2000), new Wall(2), new Wall(1)};
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                k=j+1;
                if (obstacles[j].overcome(participant[i])) {
                    System.out.println("Participant "+participant[i]+" passed the obstacle "+obstacles[j]+" at a distance "+ k);
                }else {
                    System.out.println("Participant "+participant[i]+" didn't pass the obstacle "+obstacles[j]+" at a distance "+ k+". Passed "+(k-1));
                    break;
                }
            }
            System.out.println();
        }
    }
}
