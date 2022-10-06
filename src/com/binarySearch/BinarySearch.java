package com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,10,13,18,19};
        int s = 0;
        int e = arr.length -1;
        int target = 20;

        int index = binarySearchAsc(arr,s,e,target);
        System.out.printf("ans is %d",index);
    }

    static int binarySearchAsc(int arr[],int s,int e,int target){

        if(arr.length == 0 || (target < arr[0]) || (target > arr[arr.length - 1]) ){
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
