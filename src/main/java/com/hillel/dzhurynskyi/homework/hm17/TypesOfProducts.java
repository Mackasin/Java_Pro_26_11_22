package com.hillel.dzhurynskyi.homework.hm17;

public enum TypesOfProducts {
    BOOK("Book"),
    TOY("Toy"),
    MILK("Milk"),
    CHOCOLATE("Chocolate"),
    BREAD("Bread");
private String name;
    TypesOfProducts(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
