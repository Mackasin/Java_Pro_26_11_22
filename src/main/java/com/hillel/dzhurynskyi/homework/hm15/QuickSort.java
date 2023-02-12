package com.hillel.dzhurynskyi.homework.hm15;

public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] intValues, int startIndex, int endIndex) {

        int pivot = intValues[endIndex];

        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++) {
            if (intValues[j] < pivot) {
                i++;
                swap(intValues, i, j);
            }
        }
        swap(intValues, i + 1, endIndex);
        return i + 1;
    }

    private void sort(int[] intValues, int startIndex, int endIndex) {
        if (startIndex < endIndex) {

            int partitionIndex = partition(intValues, startIndex, endIndex);

            sort(intValues, startIndex, partitionIndex - 1);
            sort(intValues, partitionIndex + 1, endIndex);
        }
    }

    public void sort(int[] intValues) {
        sort(intValues, 0, intValues.length - 1);
    }
}
