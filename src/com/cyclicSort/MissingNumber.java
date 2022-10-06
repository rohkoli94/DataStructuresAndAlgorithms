package com.cyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3,0,1}; //{0,1}; // {9,6,4,2,3,5,7,0,1};
        System.out.println("unsorted arr "+Arrays.toString(arr));

        int i = 0;
        while(i < arr.length) {
            int checkIndex = arr[i]; // if range is 1 to n
            if ( arr[i] < arr.length && arr[i] != arr[checkIndex]) {
                swap(arr, i, checkIndex);//swap
            } else {
                i++;
            }
        }
        System.out.println("sorted arr "+Arrays.toString(arr));

        boolean missingFound = false;
        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j]){
                System.out.println("missing number is "+j);
                missingFound = true;
                break;
            }
        }
        if(!missingFound){
            System.out.println("ans is "+arr.length);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
