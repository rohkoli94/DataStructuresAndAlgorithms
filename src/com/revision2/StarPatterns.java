package com.revision2;

public class StarPatterns {

    public static void main(String[] args) {
        pattern1(5,0);
       pattern2(5,0);
        System.out.println();
        // below is GFG method
        pattern3(5,5);
    }

    private static void pattern1(int r, int c) {
        //bae condition
        if(r == 0){
            return;
        }

        if(c <r) {
            System.out.print("* ");
            pattern1(r,c+1);
        }else{
            System.out.println();
            pattern1(r-1,0);
        }
    }

    private static void pattern2(int r, int c) {
        //bae condition
        if(r == 0){
            return;
        }

        if(c <r) {
            pattern2(r,c+1);
            System.out.print("* ");
        }else{
            pattern2(r-1,0);
            if(r !=1){
                System.out.println();
            }
        }
    }

    private static void pattern3(int num, int numCopy){
        if(num == 0){
            return;
        }
        printSpace(num-1);
        printStar(numCopy-num+1);
        System.out.println();
        pattern3(num-1,numCopy);
    }

    private static void printSpace(int n) {
        //bc
        if(n ==0){
            return;
        }
        System.out.print(" ");
        printSpace(n-1);
    }

    private static void printStar(int n) {
        //bc
        if(n ==0){
            return;
        }
        System.out.print("*");
        printStar(n-1);
    }}