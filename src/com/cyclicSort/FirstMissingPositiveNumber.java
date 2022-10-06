package com.cyclicSort;

import java.util.Arrays;

class FirstMissingPositiveNumber {
    public static void main(String[] args) {

        int[] arr = {3,4,-1,1}; //{0,1}; // {9,6,4,2,3,5,7,0,1};
        System.out.println("unsorted arr "+ Arrays.toString(arr));

        int i = 0;
        while(i < arr.length) {
            int checkIndex = arr[i] -1; // if range is 1 to n
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[checkIndex]) {
                swap(arr, i, checkIndex);//swap
            } else {
                i++;
            }
        }
        System.out.println("sorted arr "+Arrays.toString(arr));

        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if(j+1 != arr[j]){
                found = true;
                int ans = j+1;
                System.out.println("ans is "+ans);
                break;
            }
        }
        if(!found){
            System.out.println("ans is "+arr.length);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}