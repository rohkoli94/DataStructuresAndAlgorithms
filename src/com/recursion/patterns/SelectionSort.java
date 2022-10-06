package com.recursion.patterns;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = {1,4,3,2};
        System.out.println("unsorted array ARR1 "+Arrays.toString(arr1));
        selectionSort(arr1,arr1.length,0,0);
        System.out.println("sorted array is "+Arrays.toString(arr1));
    }

    private static void selectionSort(int[] arr, int r, int c, int maxIndex) {
        //base conditon
        if(r == 0){
            return;
        }
        if(c < r){ // inner loop
            if(arr[c] > arr[maxIndex]) {
                maxIndex = c;
            }
            selectionSort(arr,r,c+1,maxIndex);
        }else{ // outer loop
            //swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
