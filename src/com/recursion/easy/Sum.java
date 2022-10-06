package com.recursion.easy;

public class Sum {

    public static void main(String[] args) {
        int n = 5;
        int ans = sum(n);
        System.out.println("sum is "+ans);
    }

    static int sum(int n){
        /*
        n =5
        5! = 5+4+3+2+1

        1) it is getting breakdown into smaller problems
        2) recurrence relation = N+sum(N-1)
            5*sum(4)
                4*sum(3)
                    3*sum(2)
                        2*sum(1)

         3_ Base Condition : if n==1 return 1;

         */
        if(n == 1){  //as 0 and 1 sum is 1
            return 1;
        }
        return n+sum(n-1);
    }
}
