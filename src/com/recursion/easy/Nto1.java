package com.recursion.easy;

public class Nto1 {

    public static void main(String[] args) {
        int n = 5;
        // print n to 1 using n which is bigger than 1
        //fun(n);

        // print 1 to n using n which is bigger than 1
        //rev(n);

        //print n to 1 and 1 to n
        both(n);
    }

    static void fun(int n){
        //
        // base condition
        if(n ==0){
            return;
        }

        System.out.println(n + " ");
        fun(n-1);
    }

    static void rev(int n){
        //base condition
        if(n ==0){
            return;
        }

        rev(n-1);
        System.out.println(n + " ");
    }


    static void both(int n){
        //
        // base condition
        if(n ==0){
            return;
        }

        System.out.println(n + " ");
        both(n-1);
        System.out.println(n + " ");
    }
}
