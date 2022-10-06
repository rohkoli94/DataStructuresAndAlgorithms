package com.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2}; //{0,1};;
        System.out.println("unsorted arr "+Arrays.toString(arr));

        int i = 0;
        while(i < arr.length) {
            int checkIndex = arr[i] -1; // if range is 1 to n
            if (arr[i] != arr[checkIndex]) {
                swap(arr, i, checkIndex);//swap
            } else {
                i++;
            }
        }
        System.out.println("sorted arr "+Arrays.toString(arr));

        ArrayList<Integer> ans = new ArrayList();
        for (int j = 0; j < arr.length; j++) {
            if(j+1 != arr[j]){
                ans.add(arr[j]);
            }
        }
        System.out.println("duplicates are "+ans.toString());
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
