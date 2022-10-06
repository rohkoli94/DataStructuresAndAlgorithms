package com.maths;

public class PrimeNo {

    public static void main(String[] args) {
        int n = 1;
        System.out.println(n+" is prime -> "+isPrime(n));
    }

    static boolean isPrime(int n){

        if(n < 2){
            return false;
        }
        for (int i = 2; i*i <= n ; i++) { // or i <= Math.sqrt(i)
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
