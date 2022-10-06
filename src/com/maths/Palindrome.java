package com.maths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        palindromeNum(n);

        System.out.println();

        String s = "abba";
        stringPalindrome(s);
    }

    private static void stringPalindrome(String s) {
        boolean notPal = false;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                System.out.println("string is not palindrome");
                notPal = true;
                break;
            }
        }
        if(!notPal){
            System.out.println("string is palindrome");
        }
    }

    private static void palindromeNum(int n) {
        int temp = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = (ans*10)+rem;
            n = n/10;
        }
        if(ans == temp){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palimdrome");
        }
    }
}
