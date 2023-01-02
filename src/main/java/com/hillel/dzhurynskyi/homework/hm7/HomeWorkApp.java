package com.hillel.dzhurynskyi.homework.hm7;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(10, 20) + "\n");
        checkNumb(-10);
        System.out.println(checkNumbForBool(-10) + "\n");
        printMessage(5, "bb bb");
        System.out.println("\n" + leapYear(2072));
    }

    static void printThreeWords() {
        System.out.println("Apple\nOrange\nBanana\n");
    }

    static void checkSumSign() {
        int a = 5, b = -6;
        if (a + b >= 0) {
            System.out.println("sum is positive\n");
        } else System.out.println("sum is negative\n");
    }

    static void printColor() {
        int value = -10;
        if (value <= 0) {
            System.out.println("red\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("yellow\n");
        } else System.out.println("green\n");
    }

    static void compareNumbers() {
        int a = -5, b = 6;
        if (a >= b) System.out.println("a>=b\n");
        else System.out.println("a<b\n");
    }

    static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkNumb(int b) {
        if (b >= 0) System.out.println("numb is positive\n");
        else System.out.println("numb is negative\n");
    }

    static boolean checkNumbForBool(int b) {
        return b < 0;
    }

    static void printMessage(int k, String text) {
        for (int i = 0; i < k; i++) {
            System.out.println(text);
        }
    }

    static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
