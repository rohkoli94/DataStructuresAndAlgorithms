package com.binarySearch;

import java.util.Arrays;

public class FindStartAndEndPosition {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,8,8,8,9,10};
        int target = 11;

        int[] ans = {-1,-1};
        ans[0] = bs(arr,target,true);
        if(ans[0] != -1){
            ans[1] = bs(arr,target,false);
        }
        System.out.println("ans is "+ Arrays.toString(ans));

    }

  static int bs(int[]arr, int target, boolean leftSearch){
        int ans = -1;
      int s = 0;
      int e = arr.length -1;

      while(s<=e){
          int mid = s + (e-s) /2;
          if(target > arr[mid]){
              s = mid +1;
          }else if(target < arr[mid]){
              e = mid -1;
          }else{
              ans = mid;
              if(leftSearch){
                  e = mid -1;
              }else{
                  s = mid +1;
              }
          }
      }
        return ans;
  }


}
