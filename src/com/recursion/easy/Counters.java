package com.recursion.easy;

public class Counters {

    public static void main(String[] args) {
        int num = 7030;
        int ans = counter(num);
        System.out.println("counter is "+ans);
    }

    static int counter(int n){
        return helper(n,0);
    }

    static int helper(int n, int c ){
        // base condiiton
        if(n == 0){
            return c;
        };

        int rem = n%10;
        if(rem == 0){
            c++;
        }
        n = n/10;
        return helper(n/10,c);
    }
}
