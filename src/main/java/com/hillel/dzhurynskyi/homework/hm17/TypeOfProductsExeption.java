package com.hillel.dzhurynskyi.homework.hm17;

public class TypeOfProductsExeption extends RuntimeException {
    private String message;

    public TypeOfProductsExeption(TypesOfProducts type) {
        this.message = "The Product from category " + type + " is not found\n";
    }


    @Override
    public String getMessage() {
        return message;
    }
}
