package com.maths;

public class SquareRoot {

    public static void main(String[] args) {
        int n = 36; ///40
        int precision = 3;
        double ans = sqRt(n,precision);
        System.out.println("sq root of num is"+ans);
    }

    static double sqRt(int n,int precision){
        int s  = 1 ;
        int e  = n;

        double ans;
        while(s <=e){
            double mid = s + (e-s) /2;
            if(mid*mid == n){
               return mid;
            }
            if(mid>n){
            e = (int)mid-1;
            }else{
                s = (int)mid +1;
            }
        }
        ans = e;
        double preVal = 0.1;
        for (int i = 1; i < precision; i++) {

            while(ans*ans <= n){
                ans = ans+precision;
                if(ans == n){
                    return ans;
                }
            }
            ans = ans - preVal;
            preVal = preVal / 10; // preval/= 10;
        }
        return ans;
    }
}
