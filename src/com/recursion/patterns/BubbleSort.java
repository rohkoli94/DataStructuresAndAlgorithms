package com.recursion.patterns;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {3,2,1};
        System.out.println("unsorted array ARR1 "+Arrays.toString(arr1));
        bubblesort(arr1,arr1.length-1,0);
        System.out.println("sorted array is "+Arrays.toString(arr1));
    }

    private static void bubblesort(int[] arr, int r, int c) {
        //base conditon
        if(r == 0){
            return;
        }
        if(c < r){ // inner loop
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr,r,c+1);
        }else{ // outer loop
            bubblesort(arr,r-1,0);
        }
    }
}
