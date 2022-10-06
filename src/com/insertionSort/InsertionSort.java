package com.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9,3,2,1};
        System.out.println("unsortedArray "+ Arrays.toString(arr));

        for(int i=0; i< arr.length -1;i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
            }
            }

        System.out.println("sortedArray "+ Arrays.toString(arr));
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
