package com.revision2;

public interface RecursionArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        boolean ans = check(arr, 0);
        System.out.println("sorted " + ans);

        int[] arr1 = {4,3,2,8,9,0};
        int target  =10;
        boolean ans1 = findtarget(arr1,0,target);
        System.out.println("target found "+ans1);
        System.out.println("target index found "+findtargetIndex(arr1,0,target));

        int[] arr2 = {9,9,9,9,9,10,1,2,3};
        int target2 = 3;
        int ans2 = rotatedBinarySearch(arr2,0, arr2.length -1,target2);
        System.out.println("rotated binary search target found "+ans2);


    }

    static int rotatedBinarySearch(int[] arr,int s , int e,int target){
        //base condition
        if(s>e){
            return -1;
        }

        int mid = s + (e-s) /2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s] <= arr[mid]){ // it is sorted
            if(target >= arr[s] && target <= arr[mid]){
               return rotatedBinarySearch(arr,s,mid,target);
            }else{
              return  rotatedBinarySearch(arr,mid+1,e,target);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return rotatedBinarySearch(arr,mid,e,target);
        }
        return rotatedBinarySearch(arr,s,mid,target);
    }

    static boolean findtarget(int[] arr, int i, int target){
        //base condition
        if(i == arr.length){
            return false;
        }
        return (arr[i] == target) || findtarget(arr,i+1,target);

    }
    static int findtargetIndex(int[] arr, int i, int target){
        //base condition
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return findtargetIndex(arr,i+1,target);

    }
    static boolean check(int[] arr, int i) {
        //base conditon()
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] <= arr[i + 1] && check(arr,i + 1);
    }
}
