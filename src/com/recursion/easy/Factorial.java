package com.recursion.easy;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println("factorial is "+ans);
    }

    static int fact(int n){
        /*
        n =5
        5! = 5*4*3*2*1

        1) it is getting breakdown into smaller problems
        2) recurrence relation = N*fact(N-1)
            5*fact(4)
                4*fact(3)
                    3*fact(2)
                        2*fact(1)

         3_ Base Condition : if n==1 return 1;

         */
        if(n <= 1){  //as 0 and 1 factorial is 1
            return 1;
        }
        return n*fact(n-1);
    }
}
