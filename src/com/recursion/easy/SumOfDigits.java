package com.recursion.easy;

public class SumOfDigits {


    public static void main(String[] args) {
        int n = 123;
        int ans = sumOfdigits(n);
        System.out.println("ans is "+ans);
     }

    static int sumOfdigits(int n){
        //base condition
        if(n == 0){
            return 0;
        }
        //recurrence relation
        return (n%10)+sumOfdigits(n/10);
    }


}
