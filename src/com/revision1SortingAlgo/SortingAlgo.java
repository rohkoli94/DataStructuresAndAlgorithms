package com.revision1SortingAlgo;

import java.util.Arrays;

public class SortingAlgo {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.println("unsorted array "+ Arrays.toString(arr));

        insertionSort(arr);
        selectionSort(arr);
        bubbleSort(arr);

    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >= 1 ; j--) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }

        System.out.println("insertionSort array "+ Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i ; j++) {
                if(arr[j] >= arr[maxIndex]){
                    maxIndex = j;
                }

            }
            swap(arr,maxIndex,lastIndex);
        }

        System.out.println("selectionSort array "+ Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean alreadySorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    alreadySorted = false;
                }
            }
            if(alreadySorted){
                break;
            }
        }

        System.out.println("bubbleSort array "+ Arrays.toString(arr));

    }
}
