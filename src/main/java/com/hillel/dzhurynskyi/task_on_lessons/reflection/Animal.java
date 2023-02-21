package com.hillel.dzhurynskyi.task_on_lessons.reflection;

public class Animal {
    private String name;
    private int old;
    private boolean hasTail;
    private String family;

    public Animal(String name, int old, boolean hasTail, String family) {
        this.name = name;
        this.old = old;
        this.hasTail = hasTail;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", hasTail=" + hasTail +
                ", family='" + family + '\'' +
                '}';
    }
}
