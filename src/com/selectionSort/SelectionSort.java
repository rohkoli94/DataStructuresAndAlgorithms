package com.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,3,2,1};
        System.out.println("unsorted arr "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length - 1 - i;
            for (int j = 0; j <  arr.length - i; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
             swap(arr,max,last);

        }
        System.out.println("sorted arr "+Arrays.toString(arr));
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
