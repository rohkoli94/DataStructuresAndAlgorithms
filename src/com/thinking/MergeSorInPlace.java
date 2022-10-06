package com.thinking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSorInPlace {
    public static void main(String[] args) {
        int[] arr = {9,5,4,3,2,1};
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
