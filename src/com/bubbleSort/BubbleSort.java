package com.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9,3,2,1};
        System.out.println("unsortedArray "+ Arrays.toString(arr));

        for(int i=0; i< arr.length;i++){
            boolean isSwapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                // already sorted
                break;
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
