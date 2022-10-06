package com.recursion.patterns;

public class Star {

    public static void main(String[] args) {
        int n = 3;
        /*

        Pattern 1
        *****
        ****
        ***
        **
        *

        Pattern 2
        *
        **
        ***
        ****
        *****

         */

       print1(n,0);
        System.out.println("---------------------");
        print2(n,0);
        System.out.println("---------------------");

    }


    private static void print2(int r, int c) {
        // base condition
        if(r ==0) {
            return;
            }
        if(c < r){
            print2(r,c+1);
            System.out.print("*");
        }else{
            print2(r-1,0);
            if(r != 1){
                System.out.println();
            }
        }

    }

    private static void print1(int r, int c) {
    //base condition
        if(r == 0){
            return;
        }
        // inner loop (printing star) using cols
        if(c < r){
            System.out.print("*");
            print1(r,c+1);
        }else{ // outer loop (rows)
            System.out.println();
            print1(r-1,0);
        }
    }
}
