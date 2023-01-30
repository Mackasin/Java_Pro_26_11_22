package com.hillel.dzhurynskyi.homework.hm15;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] x = { 8, 0, 4, 6, 3, 7, 10, 12, -3 };
        System.out.println("Was");
        System.out.println(Arrays.toString(x));

        quickSort.sort(x);

        System.out.println("Became with quick sort");
        System.out.println(Arrays.toString(x));

        int[] a = { 8, 0, 4, 6, 3, 7, 10, 12, -3 };
        ShakerSort shakerSort=new ShakerSort();
        shakerSort.sort(a);

        System.out.println("Became with shaker sort");
        System.out.println(Arrays.toString(a));
    }
}

