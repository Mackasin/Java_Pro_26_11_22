package com.hillel.dzhurynskyi.homework.hm5.cat;

import com.hillel.dzhurynskyi.homework.hm5.animal.Animal;

public class Cat extends Animal {
    private static int count1 = 0;
    public Cat(String name) {
        super(name);
        count1++;
    }
    @Override
    public void run(int n) {
        if(n>200){
            System.out.println(name+" can`t run over then 200 m");
        }else {
        super.run(n);}
    }

    @Override
    public void swim(int n) {
        System.out.println(name+" can`t swim");
    }
    public static int getCount1() {
        return count1;
    }
}
