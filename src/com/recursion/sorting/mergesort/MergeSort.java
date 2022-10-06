package com.recursion.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};

        int[] ans =  mergeSort(arr);
        System.out.println("unsorted array is "+Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] arr) {
        //base conditon
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)); //exclusive
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i =0;
        int j =0;
        int k =0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length ){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length ){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
