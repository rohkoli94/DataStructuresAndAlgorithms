package com.bitwise;

public class ArrayHAsPositiveNegativeEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,-2,-3,7};

        findSingle(arr); // use XOR to find exact two duplicated
    }

    private static void findSingle(int[] arr) {
        int ans = 0;
        for (int num :arr){
            ans = ans + num;
        }
        System.out.println("single num is "+ans);
    }
}
