package com.binarySearch;

import java.util.Arrays;

public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,18,22};
        int target = 23;

        System.out.println(Arrays.toString(arr));

        int ansCeil, ansFloor;
        ansCeil = ceil(arr,target);
        ansFloor = floor(arr,target);
        System.out.println("ceil is "+ansCeil);
        System.out.printf("floor is %d",ansFloor);
    }

    static int ceil(int[] arr, int target){
        if(target > arr[arr.length -1]){
            return -1;
        }
        int s = 0;
        int e = arr.length -1;

        while(s<=e){
            int mid = s + (e-s) /2;
            if(target > arr[mid]){
                s = mid +1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }
        return s;
    }
    static int floor(int[] arr, int target){

        int s = 0;
        int e = arr.length -1;

        while(s<=e){
            int mid = s + (e-s) /2;
            if(target > arr[mid]){
                s = mid +1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }
        return e;
    }
}
