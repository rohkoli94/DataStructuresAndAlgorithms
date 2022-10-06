package com.bitwise;

public class FindNthMagicNumber {

    public static void main(String[] args) {
        int n = 5;

        magicNum(n);
    }

    private static void magicNum(int n) {
        //1011 = 1*5^4 and so on
        int base = 5;
        int i = 1;
        int ans = 0;

        while(i <= 5){
            int rem = n&1;
        ans = ans + (rem*base);
        base = base*5;
        n = n>>1;
        i++;
        }

        System.out.println("ans is "+ans);
    }
}
