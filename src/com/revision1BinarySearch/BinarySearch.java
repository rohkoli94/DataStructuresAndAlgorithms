package com.revision1BinarySearch;

import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9,12};
        int target = 4;
        int s = 0;
        int e = arr.length -1;

        //Q.1 search element in ascending order
        System.out.println("Binary search "+binarySearch(arr,s,e,target));

        //Q.2 ceil of number
        System.out.println("Ceil of number is "+ceil(arr,s,e,target));
        //Q.3 floor of number
        System.out.println("Floor of number is "+floor(arr,s,e,target));
        //Q.4 next Greatest Occurance Or Wrap of it
        System.out.println("Next Greatest Occurance Or Wrap of number is "+nextGreatestOccuranceOrWrap(arr,s,e,target));
        //Q.5 Star and End position of number
        startAndEndPositon();
        //Q.6 Find element in infinite array
        System.out.println("Element in infinite array "+infiniteArray(arr,target));
        //Q.7 Find element in mountain array
        mountainArray();
        //Q.8 Find Element in Rotated Sorted Array (Distinct / Duplicate)
        rotatedSortedArray();
        //Q.9 Spliat Array Largest Sum
        splitArrayLargestSum();
    }

    static void splitArrayLargestSum(){
        int[] arr = {1,2,7,3,4,9,34,56,15,68};
        int m = 2; //split into 2 continius array

        // finding posibilities (range to userBinary Search)
        int e = Integer.MIN_VALUE;
        int s = 0;

        for (int num :arr){
            e = Math.max(e,num);
            s += num;
        }

        while(s <e){
            int mid = s + (e-s) /2;
            /*
            mid is possible ans
            try to split as per M parts and check
            If it is getting splitted in M or lesss parts then take end = m i.e(check on left);
            else s= mid +1 (check on right)
             */
            int pieces = 1;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if(sum > mid){
                    sum = arr[i];
                    pieces++;
                }
            }
            //check if peices match or are less
            if(pieces <= m){
                e = mid; //possible ans but keep searching on left
            }else{
                s = mid+1;
            }
        }
        System.out.println("Split array largest sum is "+s); // e

    }
    private static void rotatedSortedArray() {
        //int[] arr = {6,7,8,1,2,3,4};
        int[] arr = {9,9,9,1,2,3,4};

        int target = 4;
        int ans;

        //int peak = rSADistinct(arr); // distinct
        int peak = rSADuplicate(arr); // duplicate

        int rotatedArrayCount = peak + 1;
        System.out.println("Array is rotated this number of times "+rotatedArrayCount);
        if(target == arr[peak]){
            ans = peak;
        }else if(peak == -1){
            // not roated
            //binary search
            ans = binarySearch(arr,0,arr.length - 1,target);
        }else if(target >= arr[0]){
            //bs  from 0 to peak -1
            ans = binarySearch(arr,0,peak - 1,target);
        }else{
            //bs from peak +1 to e
            ans = binarySearch(arr,peak + 1,arr.length - 1,target);
        }

        System.out.println("RoatedSorted Array ans is "+ans);
    }


    static int rSADuplicate(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid  = s + (e-s) /2;
            // ans
            if(mid < e && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // ans
            if(mid> s && arr[mid-1] > arr[mid]){
                return mid -1;
            }
            //supporting conditions to compress array
           if(arr[s] == arr[mid] && arr[mid] == arr[e]){  //e.g  9S,8,9M,9,9,9E or 9S,9,9M,9,9,10,9E
               // we cn skip start and end, but before that check end cases
               if(s < e && arr[s] > arr[s+1]){
                return s;    //ans
               }
               s++;

               if(e > s && arr[e-1] > arr[e]){
                   return e-1;  //ans
               }
               e--;
           }else if(arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e]) ){  //e.g 6S,7M,8,9,10,1,2,3  or 9S,9,9,9M,10,1,2,3,4E
               s = mid+1;
           }else{
                e = mid-1;
           }
        }
        return -1;
    }
    static int rSADistinct(int[] arr){

        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid  = s + (e-s) /2;
            // ans
            if(mid < e && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // ans
            if(mid> s && arr[mid-1] > arr[mid]){
                return mid -1;
            }
//supporting conditions to compress array
            if(arr[s] > arr[mid]){   // e.g 6St,7,8,9,10,1Mid,2,3,4   so bring end before mid
             e = mid -1;
            }else{ // e.g 6St,7,8,9,10M,1,2,3,4   so bring start after mid
            s = mid + 1;
            }
        }
        return -1;
    }

    private static void mountainArray() {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int target = 4;
        int[] ans = {-1,-1};

        int peak = findPeakInMountain(arr);
        if(target == arr[peak]){
            ans[0] = peak;
            ans[1] = peak;
        }else{
            ans[0] = binarySearchAg(arr,0,peak - 1,target,true);
            ans[1] = binarySearchAg(arr,peak +1,arr.length - 1,target,false);
        }
        System.out.println("Element in mountain array lies on "+Arrays.toString(ans));
    }

    static int findPeakInMountain(int[] arr){

        int s = 0;
        int e = arr.length - 1;

        while(s <e){
            int mid = s+(e-s)/2;

            if(arr[mid] > arr[mid+1]){
                e = mid;
            }else{
                s = mid +1;
            }
        }
        return s; //e
    }
    static int infiniteArray(int[]arr,int target){
        int s = 0;
        int e = 1;

        while(target > arr[e]){
        int temp = s;
        e = e + (e-s + 1) * 2;
        s = temp;
        }
        return binarySearch(arr,s,e,target);
    }
    private static void startAndEndPositon() {
        int[] arr = {1,2,3,4,5,5,5,5,5,5,6,7,8,9};
        int target = 5;
        int[] ans = {-1,-1};
        ans[0] = startAndEndPositonSol(arr,target,true);
        if(ans[0] != -1){
            ans[1] = startAndEndPositonSol(arr,target,false);
        }
        System.out.println("Start and End Position of number is "+ Arrays.toString(ans));
    }

    static int startAndEndPositonSol(int[]arr,int target,boolean leftSearch){
        int s =0;
        int e = arr.length - 1;

        int ans = -1;


        while (s <=e){
            int mid = s + (e-s) /2;
            if(target > arr[mid]){
                s = mid +1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                ans = mid;
                if(leftSearch){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }

    static int binarySearch(int[]arr,int s,int e, int target) {

        while (s <=e){
            int mid = s + (e-s) /2;
            if(target > arr[mid]){
                s = mid +1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchAg(int[]arr,int s,int e, int target,boolean asc) {

        while (s <=e){
            int mid = s + (e-s) /2;

            if(target == arr[mid]){
                return mid;
            };
            if(asc){
                if(target > arr[mid]){
                    s = mid +1;
                }else if(target < arr[mid]){
                    e = mid -1;
                }
            }else{
                if(target > arr[mid]){
                    e = mid  - 1;
                }else if(target < arr[mid]){
                    s = mid +1;
                }
            }

        }
        return -1;
    }

    static int ceil(int[]arr,int s,int e, int target) {
            if(target > arr[arr.length -1]){
                return -1;
            }
        while (s <=e){
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

    static int floor(int[]arr,int s,int e, int target) {

        while (s <=e){
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

    static int nextGreatestOccuranceOrWrap(int[]arr,int s,int e, int target) {

        while (s <=e){
            int mid = s + (e-s) /2;
            if(target < arr[mid]){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return arr[s%arr.length];
    }
}
