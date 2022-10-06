package com.maths;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int arrLength = arr.length + 1;
        int finalArrLength = arrLength /2;
        for (int i = 0; i < finalArrLength; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("rever arr is "+ Arrays.toString(arr));
    }
}
