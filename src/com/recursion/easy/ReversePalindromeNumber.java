package com.recursion.easy;

public class ReversePalindromeNumber {

    static int sum = 0;
    static int rev(int n){
        int digits = (int)Math.log10(n) +1;
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        // base condition
        if(n%10 == n){
           return n;
        }
        int rem = n%10;
        return rem * (int) Math.pow(10,digits - 1) + helper(n/10,digits - 1);
    }

    static void rev1(int n){
        // base condition
        if(n  == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        n = n/10;
        rev1(n);
    }

    static boolean checkPalindrome(int n){
        return (n == rev(n));
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("original number is "+n);

        int ans = rev(n);
        System.out.println("reversed number is "+ans);

        rev1(n);
        System.out.println("reversed(method1) number is "+sum);

        System.out.println("number is palindrome "+checkPalindrome(n));
    }
}
