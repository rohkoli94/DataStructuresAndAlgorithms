package com.binarySearch;

public class RoatedBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {10,11,12,1,2,3,8,9};
        int[] arr = {10,11,12,13,1,2,3,8,9,10,10,10};
        int target = 10;

        //int peak = peak(arr);
        int peak = peakDuplicate(arr);
        int ans = -1;

        // if -1 then array is not rotated
        if(peak == -1){
            // normal bs
           ans =  binarySearchAsc(arr,0,arr.length -1,target);
        }else if(target == arr[peak]){
            ans = peak;
        }else if(target >=  arr[0]){
            // it lies from starting o to pek -1
            ans =  binarySearchAsc(arr,0,peak-1,target);
        }else{
            ans =  binarySearchAsc(arr,peak + 1,arr.length -1,target);
        }

        System.out.println("ans is "+ans);
        int peakCounter = peak +1;
        System.out.printf("array is rotated %d many times",peakCounter );
    }

    static int peak(int[]arr){
        int s = 0;
        int e = arr.length -1;

        while(s <=e){
            int mid = s + (e-s)/2;

            if(mid < e && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > s  && arr[mid -1] > arr[mid]){
                return mid -1;
            }
            if(arr[s] > arr[mid]){
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }

        return -1;
    }

    static int peakDuplicate(int[]arr){
        int s = 0;
        int e = arr.length -1;

        while(s <=e){
            int mid = s + (e-s)/2;

            if(mid < e && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > s  && arr[mid -1] > arr[mid]){
                return mid -1;
            }
            if(arr[s] == arr[mid]  && arr[mid] == arr[e]){
                //skip but check end case
                if(s < e  && arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(e > s  && arr[e-1] > arr[e]){
                    return e-1;
                }
                e--;
            }else if(arr[s] < arr[mid] || (arr[s] == arr[mid]  && arr[mid] > arr[e])){
                s = mid +1;
            }else{
                e =mid-1;
            }

        }

        return -1;
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
