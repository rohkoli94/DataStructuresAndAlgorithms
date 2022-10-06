package com.maths;

public class FindAllPrimeNos {

    public static void main(String[] args) {
        int n = 40;

        //bruteForce
        System.out.println("brute force version is below  Time O(n * sqrt(n))");
        bruteForce(n);
        System.out.println();
        System.out.println("optimised version is below");
        /*
        elimination method does below
        n/2 + n/3 + n/4 + n/5
        n(1/2 + 1/3 + 1/4 + 1/5) --> harmonic progression --> log(log N)

        Total time complexity )O (Sqrt(N)* log(log N)
        */

        //optimised
        printAllPrimeUptoN(n);
    }

    static void printAllPrimeUptoN(int n){

        boolean[] primeArr = new boolean[n+1]; // consider false means primeno, true means not prime
        for (int i =2; i*i <=n ; i++) {
            if(!primeArr[i]){ // if true means already it is eliminated, don't check
                checkPrime(i,primeArr);
                //eliminate
                eliminateMutiples(i,n,primeArr);
            }
        }

        for (int j = 2; j < primeArr.length; j++) {
            if(!primeArr[j]){
                System.out.print(j+" ");
            }
        }

    }

    private static void eliminateMutiples(int i, int n,boolean[] primeArr) {
        int base = i+i;
        while(base <= n){
            primeArr[base] = true;
            base = base+i;
        }
    }

    static void checkPrime(int numToCheck,boolean[] primeArr){

        for (int i = 2; i*i <= numToCheck; i++) { // check prime
            if(numToCheck%i==0){
                primeArr[numToCheck] = true;
                break;
            }
        }
    }

    //brute fore
    static void bruteForce(int n){
        for (int i = 2; i <= n ; i++) {
            boolean isPrime = bruteForCheckPrime(i);
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }

    static boolean bruteForCheckPrime(int n){
        for (int i = 2; i*i <= n ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
