package com.hillel.dzhurynskyi.homework.hm6;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        ArrayValueCalculator calculator=new ArrayValueCalculator();
        String[][] array={
                {"0","5","1","8"},
                {"4","2","3","6"},
                {"3","9","0","34"},
                {"0","5","3","6"},

        };
        System.out.println("Equals "+calculator.doCalc(array));
    }
}
