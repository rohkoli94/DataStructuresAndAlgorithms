package com.revision1Cyclic;

import java.util.Arrays;

public class CyclicSortRev1 {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("array "+ Arrays.toString(arr));
        sort(arr);
    }

    static void sort(int[] arr){
        int i = 0;

        while(i < arr.length){
            int checkIndex = arr[i] - 1; // if range is 1 to n do this else arr[i]
            if(arr[i] != arr[checkIndex]){
                swap(arr,i,checkIndex);
            }else{
                i++;
            }
        }
        System.out.println("sorted array "+ Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b){
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
