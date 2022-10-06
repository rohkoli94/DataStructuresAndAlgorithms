package com.patterns;

public class Patterns {

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~111~~~~~~~~~~~~~````");
        pattern1();

        System.out.println("~~~~~~~~~222~~~~~~~~~~~~~````");
        pattern2();

        System.out.println("~~~~~~~~~~333~~~~~~~~~~~~````");
        pattern3();

        System.out.println("~~~~~~~~~~~~444~~~~~~~~~~````");
        pattern4();

        System.out.println("~~~~~~~~~~~~~~555~~~~~~~~````");
        pattern5();

        System.out.println("~~~~~~~~~~~~~666~~~~~~~~~````");
        pattern6();

        System.out.println("~~~~~~~~~~~~~~777~~~~~~~~````");
        pattern7();

        System.out.println("~~~~~~~~~~~~~~888~~~~~~~~````");
        pattern8();

        System.out.println("~~~~~~~~~~~~~~~~999~~~~~~````");
        pattern9();

        System.out.println("~~~~~~~~~~~~~~~~10 10 10 10~~~~~~````");
        pattern10();
    }


    static void pattern1(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int colCondition = row;
            for (int col = 1; col <= colCondition; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int colCondition = n+1 -row;
            for (int col = 1; col <= colCondition; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int colCondition = n;
            for (int col = 1; col <= colCondition; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int colCondition = row;
            for (int col = 1; col <= colCondition; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n = 5;
        for (int row = 1; row <= 2*n-1; row++) {
            int colCondition;
            if(row <= n){
                colCondition = row;
            }else{
                colCondition =2*n - row;
            }
            for (int col = 1; col <= colCondition; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int colCondition = row;
            int spaceCondition = n - colCondition;

            for (int s = 1; s <= spaceCondition; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= colCondition; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n = 5;
        for (int row = 1; row <= 2*n - 1; row++) {

            int colCondition;
            int spaceCondition;

            if(row <= n){
                colCondition = row;
                spaceCondition = n - row;
            }else{
                colCondition = 2*n -row;
                spaceCondition = row - 5;
            }

            for (int s = 1; s <= spaceCondition; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= colCondition; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(){
        int n = 4;
        for (int row = 1; row <= n; row++) {
            int colCondition = row;
            int spaceCondition = n -colCondition;

            for (int s = 1; s <= spaceCondition ; s++) {
                System.out.print(" ");
            }
            for (int col = colCondition; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern9(){
        int n = 4;
        for (int row = 1; row <= 2*n -1; row++) {
            int colCondition, spaceCondition, rightColConditon;

            if(row <=n){
                colCondition = row;
                spaceCondition = n -row;
                rightColConditon = row;
            }else{
                colCondition = 2*n-row;
                spaceCondition = row - n;
                rightColConditon = 2*n - row; // as we ar starting from 2
            }
//adding space
            for (int s = 1; s <= spaceCondition ; s++) {
                System.out.print(" ");
            }
            //adding left side
            for (int col = colCondition; col >= 1; col--) {
                System.out.print(col);
            }
            //adding right side
            for (int colr = 2; colr <= rightColConditon; colr++) {
                System.out.print(colr);
            }
            System.out.println();
        }
    }

    static void pattern10(){
        int n = 8;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int leftDistance = col;
                int rightDistance = n - col;
                int leftRightMin = Math.min(leftDistance,rightDistance);
                int topDistance = row;
                int downDistance = n - row;
                int topDownMinMin = Math.min(topDistance,downDistance);

                int val = Math.min(leftRightMin,topDownMinMin);

                System.out.print(val);
            }
            System.out.println();
        }
    }
}
