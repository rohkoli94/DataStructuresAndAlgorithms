package com.binarySearch;

public class NextGreatestOccuranceOrWrap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,48,9,10,11,13,14,22};
        int target = 22;

        int ans = bs(arr,target);
        System.out.printf("ans is %d",ans);
    }

    private static int bs(int[] arr, int target) {
        int s = 0,e =arr.length -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target < arr[mid]){
                e =mid -1;
            }else{
                s = mid +1;
            }
        }
        return s % (arr.length);
    }
}
