package com.hillel.dzhurynskyi.task_on_lessons.streams;

public enum FruitType {
    STRAWBERRY("Strawberry"),
    APPLE("Apple"),
    PEAR("Pear"),
    ORANGE("Orange");

    private String name;

    FruitType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
