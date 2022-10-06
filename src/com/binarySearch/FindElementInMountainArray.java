package com.binarySearch;

import java.util.Arrays;

public class FindElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,3,2,1};
        int target = 9;
        int[] ans = {-1,-1};
        int peak = peak(arr,target);
        if(arr[peak] == target){
            ans[0] = peak;
            ans[1] = peak;
        }else{
            ans[0] = orderAgnosticBS(arr,0,peak -1,target,true);
            ans[1] = orderAgnosticBS(arr,peak +1,arr.length -1,target,false);
        }

        System.out.println("ans is "+ Arrays.toString(ans));
    }

    private static int peak(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s; // or e;
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
