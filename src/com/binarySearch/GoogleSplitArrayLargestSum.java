package com.binarySearch;

public class GoogleSplitArrayLargestSum{
    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        int m = 2;

        int ans = splitArray(arr,m);
    }

    static int splitArray(int[] arr, int m){

        int s,e;
        int minSum = 0;
        int maxSum = 0;
        for(int num :arr){
            maxSum += num;
            minSum = Math.max(minSum,num);
        }
        s = minSum;
        e = maxSum;

        //once range is found, apply binary search and try to trim as per conditions

        while(s<e){
            int mid = s+(e-s) /2;

            //mid is possible ans, check with m (pieces) if it satisfies
            // is pieces is less than or equal then it means possibily of ans on left side as we need to find min largest sum i.e compress end = mid
            // is pieces exceeds then potential answer is small, try to increase it by s = mid +1;
            int sum = 0;
            int pieces = 1;
            for (int num : arr){
                sum += num;
                if(sum > mid){ // means first array largest sum exceeds to build another (keeping track)
                    sum = num;
                    pieces++;
                }
            }
            if(pieces <= m){ // possibily ans lies on left means mid can be smaller numbr
                e = mid;
            }else{
                s = mid+1;
            }
        }

        System.out.println("ans is "+s);  //or e
    return s;
    }
        }
