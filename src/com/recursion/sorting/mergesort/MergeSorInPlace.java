package com.recursion.sorting.mergesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSorInPlace {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println("sorted array is "+ Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        //base condition
        if(e-s == 1){
            return;
        };
        int mid = s + (e-s) / 2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        /* sorting and merging takes place in below order
        1st pass (s, m, e) = 0,1,2  ==>  output (0 and 1 index will be sorted) i.e actual values (7,8)
        2nd pass           = 2,3,4  ==>  output (2 and 3 index will be sorted) i.e actual values (5,6)
        3rd pass           = 0,2,4  ==>  output (0,1,2,3 index will be sorted) i.e actual values (5,6,7,8)

        4th pass           = 4,5,6  ==>  output (4 and 5 index will be sorted) i.e actual values (3,4)
        5th pass           = 6,7,8  ==>  output (6 and 7 index will be sorted) i.e actual values (1,2)
        6th pass           = 4,6,8  ==>  output (4,5,6,7 index will be sorted) i.e actual values (1,2,3,4)

        7th pass           = 0,4,8  ==>  output (0,1,2,3,4,5,7,8 index will be sorted) i.e actual values (1,2,3,4,5,6,7,8)

        */
        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        //pointers
        int i = s;
        int j = mid;
        int k = 0;

        // first pointer shd be less than forst array and second less than second array
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            ;
            k++;
        }

        // checking array which is remaining
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        //put mix array in original array
        for (int l = 0; l < mix.length; l++) {
             arr[s+l] = mix[l];
        }
    }
}
