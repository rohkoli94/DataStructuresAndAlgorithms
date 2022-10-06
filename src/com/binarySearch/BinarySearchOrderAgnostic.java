package com.binarySearch;


public class BinarySearchOrderAgnostic {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,10,12,18,20};
//        int[] arr = new int[]{1,2,3,4,8,9,10,12,18,20};
        int ans = -1;

        int s = 0;
        int e = arr.length -1;
        int target = 22;

        if(arr.length != 0){
            if(arr[0] < arr[arr.length - 1]){
               ans = orderAgnosticBS(arr,s,e,target,true);
            }else{
                ans = orderAgnosticBS(arr,s,e,target,false);
            }
        }
        System.out.println("ans is "+ans);

    }

    static int orderAgnosticBS(int[] arr, int s, int e, int target, boolean isAsc){

        while(s <=e){
            int mid = s + (e-s) /2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }else if(target > arr[mid]){
                    e = mid -1;
                }else{
                    s = mid +1;
                }

        }

        return -1;
    }
}
