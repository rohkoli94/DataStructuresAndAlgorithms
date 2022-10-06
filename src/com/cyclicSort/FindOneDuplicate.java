package com.cyclicSort;

import java.util.Arrays;

public class FindOneDuplicate {
    public static void main(String[] args) {

        int[] arr = {3,1,3,4,2};
        System.out.println("unsorted arr "+Arrays.toString(arr));

        int i = 0;
        while(i < arr.length) {
            int checkIndex = arr[i] - 1; // if range is 1 to n
            if(arr[i] != i+1){
                if (arr[i] != arr[checkIndex]) {
                    swap(arr, i, checkIndex);//swap
                } else {
                    System.out.println("duplicate number is "+arr[i]);
                    break;
                }
            }else{
                i++;
            }

        }



    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
