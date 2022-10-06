package com.recursion.arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target = 4;
        int ans  = search(arr,0,arr.length - 1, target);
        System.out.println("ans is "+ans);
    }

    static int search(int[] arr,int s,int e, int target){
        //base condition
        if(s > e){
            return -1;
        }

        int mid = s + (e-s) / 2;

        //case 1
        if(target == arr[mid]){
            return mid;
        }
        //case 2 -  check in sorted array e.g 5s,6,7,8,9m,1,2,3,4e
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return search(arr,s,mid-1,target); // mid-1 because mid is also catched in case 1
            }else{ // search on right side
                return search(arr,mid+1,e,target);
            }
        }
        //case 3 if above not satisfied then check target with mid (check on right side)e.g 5,6,7,8,9,1m,2,3,4e
        if(target >= arr[mid] && target <= arr[e]){
            return search(arr,mid+1,e,target); // mid+1 because mid is also catched in case 1
        }
        //case 4  else ot lies on left side
        return search(arr,s,mid-1,target);
    }
}
