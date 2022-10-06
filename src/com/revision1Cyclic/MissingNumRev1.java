package com.revision1Cyclic;

import java.util.Arrays;

public class MissingNumRev1 {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("array "+ Arrays.toString(arr));
        sort(arr);
    }

    static void sort(int[] arr){
        int i = 0;

        while(i < arr.length){
            int checkIndex = arr[i] ; // if range is 1 to n do arr[i] -1 else arr[i]
            if( arr[i] < arr.length && arr[i] != arr[checkIndex]){
                swap(arr,i,checkIndex);
            }else{
                i++;
            }
        }
        System.out.println("sorted array "+ Arrays.toString(arr));

        boolean missingInRange = false;
        int ans = arr.length;

        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j]){
                ans = j;
                missingInRange = true;
                break;
            }
        }
            System.out.println("missing number is"+ans);

    }

    static void swap(int[] arr,int a,int b){
       int temp  = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
}
