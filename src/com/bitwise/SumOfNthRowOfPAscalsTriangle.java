package com.bitwise;

public class SumOfNthRowOfPAscalsTriangle {

    public static void main(String[] args) {
        int n = 3;
        pascals(n);
    }

    private static void pascals(int n) {
        /*

        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1

        formula = 2^n-1
         */
        int base = 2;
        n = n-1;
        int ans = 0;
        int i = 1;
        while(i <= n){
            ans = base;
            base = base * 2;
            i++;
        }
        System.out.println("ans is "+ans);
    }
}
