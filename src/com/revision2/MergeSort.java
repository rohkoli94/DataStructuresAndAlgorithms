package com.revision2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 3, 2, 1};
        mergsesort(arr, 0, arr.length);
        //System.out.println("sorted array is "+ Arrays.toString(arr));

        System.out.print("sorted array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergsesort(int[] arr, int s, int e) {
        //base condition
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergsesort(arr, s, mid);
        mergsesort(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //putting remaining array as t is as its already sorted ,any 1 will be hit
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // put mix array in place
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

}