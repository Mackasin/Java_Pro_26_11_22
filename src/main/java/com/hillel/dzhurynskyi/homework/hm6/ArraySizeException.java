package com.hillel.dzhurynskyi.homework.hm6;

public class ArraySizeException extends Exception {

    public ArraySizeException() {
        super("arr size is more than 4x4");
    }

    public ArraySizeException(String message) {
        super("Array size is more arr [" + message + "] [" + message + "]");
    }
}
