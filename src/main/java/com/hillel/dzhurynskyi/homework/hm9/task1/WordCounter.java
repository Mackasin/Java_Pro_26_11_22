package com.hillel.dzhurynskyi.homework.hm9.task1;

public class WordCounter {
    private String word;
    private int occurrence;

    public WordCounter (String word, int occurrence){
        this.word = word;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name: " + word +
                ", occurrence: " + occurrence +
                "}";
    }
}
