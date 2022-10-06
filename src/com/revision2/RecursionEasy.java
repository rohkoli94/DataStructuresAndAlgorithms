package com.revision2;

public class RecursionEasy {

    public static void main(String[] args) {
        int n = 5;
        print1(n);
        System.out.println();
        print2(n);
        System.out.println();
        print3(n);
        System.out.println();

        int ans = fact(n);
        System.out.println("fact is "+ans);

        int ans2 = sumUptoNum(n);
        System.out.println("sum upto num is "+ans2);

        int ans3 = sumOfDigits(1234);
        System.out.println("sum of digits is "+ans3);

        int ans4 = reverseNumber(1234);
        System.out.println("rever os num is "+ans4);

        int ans5 = countNumOfZeroes(10203040,0);
        System.out.println("no of zero is "+ans5);

        int ans9 = numOfSteps(14,0);
        System.out.println("no of steps is "+ans9);

    }

    private static int numOfSteps(int n, int count) {
        if (n == 0) {
            return  count;
        }
        count++;
        if((n&1) == 0){
            return numOfSteps(n/2,count);
        }
            return numOfSteps(n-1,count);
    }

    private static int countNumOfZeroes(int n,int count) {
        //bc
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        return countNumOfZeroes(n/10,count);
    }


    private static int calPower(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int ans = 1;
        for (int i = 2; i <= n ; i++) {
            ans = ans * 10;
        }
        return ans;
    }
    private static int reverseNumber(int n) {
        //bc
        if(n ==0){
            return 0;
        }
        int numOfDigits = (int)Math.log10(n)+1;
        int pow = calPower(numOfDigits);
        return ((n%10)* pow) + reverseNumber(n/10);
    }

    private static int sumOfDigits(int n) {

        //b.c
        if(n == 0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }

    private static int sumUptoNum(int n) {

        //b.c
        if(n == 0){
            return 0;
        };
        return n+sumUptoNum(n-1);
    }

    private static int fact(int n) {
        //base condition
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }

    private static void print1(int n){
        //b.c
        if(n == 0 ){
            return;
        }
        System.out.print(n+ " ");
        print1(n-1);
    }
    private static void print2(int n){
        //b.c
        if(n == 0 ){
            return;
        }
        print2(n-1);
        System.out.print(n+ " ");
    }
    private static void print3(int n){
        //b.c
        if(n == 0  ){
            return;
        }
        System.out.print(n+ " ");
        print3(n-1);
        System.out.print(n+ " ");
    }
}
