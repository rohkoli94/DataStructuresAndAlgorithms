package com.thinking;

public class CheckArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,7,12};
        checkSorted(arr);
    }

    private static void checkSorted(int[] arr) {
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] < arr[i]){
                sorted = false;
                break;
            }
        }
        System.out.println("arr is sorted "+sorted);
    }

}
