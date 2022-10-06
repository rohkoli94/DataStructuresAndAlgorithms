package com.revision1Cyclic;

import java.util.Arrays;

public class FindDuplicateRev1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        System.out.println("array "+ Arrays.toString(arr));
        sort(arr);
    }

    static void sort(int[] arr){
        int i = 0;

        while(i < arr.length){
            if(arr[i] != i+1){
                int checkIndex = arr[i] - 1; // if range is 1 to n do this else arr[i]
                if(arr[i] != arr[checkIndex]){
                    swap(arr,i,checkIndex);
                }else{
                    System.out.println("duplicate is "+arr[i]);
                    break;
                }
            }
            else{
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
