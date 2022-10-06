package com.binarySearch;

import java.util.Arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("arr is "+Arrays.toString(arr));
        int target = 3;
        int ans = -1;

        //find ele
        //ans = fin/dEle(arr,target);
        //System.out.println("ans is "+ans);

        // find counter, how many times array is rotated
        counter(arr);
    }

    static void counter(int[] arr){
        int pivot = findPivotDuplicate(arr);
        int ans = pivot +1;
        System.out.println("countr is "+ans);
    }
    static int findEle(int[] arr, int target){

        //int pivot = findPivot(arr);
       int pivot = findPivotDuplicate(arr);

        if(pivot == -1){
            // array is not roated, do simple binary search
           return binarySearchAsc(arr,0,arr.length -1,target);
        }
        if(target == arr[pivot]){
            return pivot;
        }
        if(target >= arr[0]){
            // means it lies between o to pivot -1
            return binarySearchAsc(arr,0,pivot -1,target);
        }
        return  binarySearchAsc(arr,pivot +1,arr.length - 1,target);
    }

    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <=e ){
            int mid = s + (e-s) /2;

            //case 1
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            //case 2
            if(mid > s && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            //case 3 and 4
            if(arr[s] > arr[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1; // means array is not rotated
    }

    static int findPivotDuplicate(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <=e ){
            int mid = s + (e-s) /2;

            //case 1
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            //case 2
            if(mid > s && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            // case 3 - skip duplicate, but check pivot is present
            if(arr[s] == arr[mid] && arr[mid] == arr[e]){
                //check before skipping
                if(s < e && arr[s] > arr[s+1]){ //e,g 9,8,9,9,9,
                    return s;
                }
                s++;
                if(e > s && arr[e-1] > arr[e]){ // e,g 9,9,9,10,9
                    return s;
                }
                e--;
            }
            //case 4 and five
            else if(arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e]) ){
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return -1; // means array is not rotated
    }

    static int binarySearchAsc(int arr[],int s,int e,int target){

        if(arr.length == 0 ){
            return -1;
        }
        while(s<=e){
            int mid = s + (e-s) / 2;
            if(target > arr[mid]) {
                s = mid + 1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
