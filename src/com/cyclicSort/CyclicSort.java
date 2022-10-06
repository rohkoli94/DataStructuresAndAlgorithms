package com.cyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {3,2,1};
        System.out.println("unsorted arr "+Arrays.toString(arr));

        int i = 0;
        while(i < arr.length) {
            int checkIndex = arr[i] - 1; // if range is 1 to n
            if (arr[i] != arr[checkIndex]) {
                swap(arr, i, checkIndex);//swap
            } else {
                i++;
            }
        }
        System.out.println("sorted arr "+Arrays.toString(arr));
}

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
