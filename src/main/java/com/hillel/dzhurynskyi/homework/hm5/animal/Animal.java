package com.hillel.dzhurynskyi.homework.hm5.animal;

public class Animal {
    private static int count = 0;
    public String name;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void run(int n) {
        System.out.println(name + " has run " + n + "m");
    }

    public void swim(int n) {
        System.out.println(name + " has swum " + n + "m");
    }
}
