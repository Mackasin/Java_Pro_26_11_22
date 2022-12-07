package com.hillel.dzhurynskyi.homework.hm5.dog;

import com.hillel.dzhurynskyi.homework.hm5.animal.Animal;

public class Dog extends Animal {
    private static int count2 = 0;

    public Dog(String name) {
        super(name);
        count2++;
    }

    public static int getCount2() {
        return count2;
    }

    @Override
    public void run(int n) {
        if (n > 500) {
            System.out.println(name + " can`t run over then 500 m");
        } else {
            super.run(n);
        }
    }

    @Override
    public void swim(int n) {
        if (n > 10) {
            System.out.println(name + " can`t swim over then 10 m");
        } else {
            super.run(n);
        }
    }

}
