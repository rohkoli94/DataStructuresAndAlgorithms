package com.revision2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,2,1};
        sort(arr,0,arr.length - 1);
        System.out.println("sorted array is "+ Arrays.toString(arr));
    }

  private static void  sort(int[] arr, int low, int high){
        //base condition
      if(low >= high){
          return;
      }
      int s = low;
      int e = high;
      int mid = s + (e-s) /2;
      int pivot = arr[mid];

      while(s<=e){
          while(arr[s] < pivot) {
              s++;
          }
          while(arr[e] > pivot){
          e--;
          }
         if(s <= e){
             int temp = arr[s];
             arr[s] = arr[e];
             arr[e] = temp;
             s++;
             e--;
         }
      }
      sort(arr,low,e);
      sort(arr,s,high);
  }
}
