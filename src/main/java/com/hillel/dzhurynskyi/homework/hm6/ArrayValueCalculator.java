package com.hillel.dzhurynskyi.homework.hm6;

public class ArrayValueCalculator {

    public int doCalc(String [][]arr) throws ArraySizeException, ArrayDataException{
        int suma = 0;

        if (arr.length > 4) {
            throw new ArraySizeException();
        } else {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length > 4) {
                    throw new ArraySizeException("index "+i);
                } else {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(arr[i][j] + " ");
                        try {
                            suma += Integer.parseInt(arr[i][j]);
                        } catch (NumberFormatException e) {
                            throw new ArrayDataException(i, j, arr[i][j]);
                        }
                    }
                }
                System.out.println("= " + suma);
            }
        }
        return suma;
    }
}
