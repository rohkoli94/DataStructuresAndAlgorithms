package com.recursion.arrays;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,8,9,10,11,12,14};
        boolean ans = check(arr,0);
        System.out.println("array is sorted "+ans);
    }

    private static boolean check(int[] arr,int i) {
        //base condition
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return  false;
        }
        return check(arr,i+1);
    }

    private static boolean checkOptimised(int[] arr,int i) {
        //base condition
        if(i == arr.length - 1){
            return true;
        }

        return (arr[i] < arr[i+1]) && checkOptimised(arr,i+1);
    }
}
