package com.hillel.dzhurynskyi.homework.hm12;

import java.util.Objects;

public class Box<T extends Fruit> {
    private final T type;
    private int amount;

    public Box(T type) {
        this.type = type;
    }

    public void addOneFruit() {
        setAmount(getAmount() + 1);
    }

    public void addManyFruits(int number) {
        setAmount(getAmount() + number);
    }

    public float getWeight() {
        return getAmount() * type.getWeight();
    }

    public boolean compare(Box box) {
        return (getWeight() == box.getWeight());
    }

    public boolean merge(Box box) {
        if (Objects.equals(box.type.getName(), type.getName())) {
            this.addManyFruits(box.getAmount());
            box.setAmount(0);
            return true;
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
