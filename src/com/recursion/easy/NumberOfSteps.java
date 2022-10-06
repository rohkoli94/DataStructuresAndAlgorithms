package com.recursion.easy;

public class NumberOfSteps {
    static int steps = 0;

    public static void main(String[] args) {
        int n = 14;
        steps(n);
        System.out.println("steps (method 1) "+steps);

        int ans = steps2(n,0);
        System.out.println("steps (method 2) "+ans);
    }


    static int steps2(int n,int c){
        if(n == 0){
            return c;
        }
        c++;
        if((n&1) == 0){
            return steps2(n/2,c);
        }
        return steps2(n-1,c);
    }
    private static void steps(int n) {
        if(n == 0){
            return;
        }
        steps++;
        if((n&1)==0){
            steps(n/2);
        }else{
            steps(n-1);
        }
    }
}
