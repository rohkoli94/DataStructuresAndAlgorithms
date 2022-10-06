package com.recursion.sorting.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,2,1};
        sort(arr,0,arr.length - 1);
        System.out.println("sorted array is "+ Arrays.toString(arr));
    }
;
    private static void sort(int[] arr,int low, int high){
        //base condition
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s) /2;
        int pivot = arr[mid];

        //putting pivot at is proper position
        while(s <=e){
            // if already sorted then it won't swap (hence better then merge sort)
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            //swapping if violation happens, check end case for s <= e
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

         //sort left and right part (as s and e crossed each other above so low to e and s to high)
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
