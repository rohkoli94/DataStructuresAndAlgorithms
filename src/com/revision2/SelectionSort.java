package com.revision2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,4,3,2,1};
        sort(arr,arr.length , 0,0);
        System.out.println("sorted "+ Arrays.toString(arr));
    }

    private static void sort(int[] arr,int r, int c, int maxIndex) {
        if(r == 0){
            return;
        }

        if(c <r ){
            //find max
            if(arr[c] > arr[maxIndex]){
                sort(arr,r,c+1,c);
            }else{
                sort(arr,r,c+1,maxIndex);
            }
        }else{
            //swap before reducing row
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r-1];
            arr[r -1] = temp;
            sort(arr,r-1,0,0);
        }
    }


}
