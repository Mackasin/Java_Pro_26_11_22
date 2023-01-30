package com.hillel.dzhurynskyi.homework.hm15;

public class ShakerSort {
    public void sort(int[]array){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            for (int i = right; i > left; --i) {
                if(array[i-1]>array[i]){
                    swap(array,i-1,i);
                }
            }
            ++left;
            for (int i = left; i <right ; ++i) {
                if (array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
            --right;
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
