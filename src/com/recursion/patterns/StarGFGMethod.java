package com.recursion.patterns;

public class StarGFGMethod {

    public static void main(String[] args) {
/*

Pattern 1
  *
 * *
* * *

Pattern 2
    *
   **
  ***
 ****
*****

Pattern 3
*
**
***
****
*****

Pattern 4
1
22
333

Pattern 5
A
BB
CCC

Pattern 6
1
23
456

Pattern 7
A
BC
DEF

*/

        int n = 3;
        print1(n,n);
        System.out.println("----------------------------------------");
        print2(n,n);
        System.out.println("----------------------------------------");
        print3(n,n);
        System.out.println("----------------------------------------");
        print4(n,n);
        System.out.println("----------------------------------------");
        print5(n,n);
        System.out.println("----------------------------------------");
        print6(n,n,1);
        System.out.println("----------------------------------------");
        print7(n,n,1);
    }

    private static void print7(int n, int numCopy,int counter) {
        if(n == 0){
            return;
        }
        // print
        counter = printSeqChar(numCopy - n + 1,counter);
        //newline
        System.out.println();
        print7(n-1,numCopy,counter);
    }

    private static int  printSeqChar(int n,int counter) {
        if(n == 0){
            return counter;
        }
        char alphabet = (char) (counter + 64);
        System.out.print(alphabet + " ");
        counter += 1;
        return printSeqChar(n-1,counter);
    }

    private static void print6(int n, int numCopy,int counter) {
        if(n == 0){
            return;
        }
        // print
        counter = printSeq(numCopy - n + 1,counter);
        //newline
        System.out.println();
        print6(n-1,numCopy,counter);
    }


    private static int  printSeq(int n,int counter) {
        if(n == 0){
            return counter;
        }
        System.out.print(counter + " ");
        counter += 1;
        return printSeq(n-1,counter);
    }


    private static void print1(int n,int numCopy) {
        if(n == 0){
            return;
        }
        // space
        space(n-1);
        //asterik
        asterik(numCopy-n+1);
        //new line
        System.out.println();
        // recursilve callong
        print1(n-1,numCopy);
    }

    private static void space(int n) {
        if(n == 0){
            return;
        }
        System.out.print(" ");
        space(n-1);
    }

    private static void asterik(int n) {
        if(n == 0){
            return;
        }
        System.out.print("* ");
        asterik(n-1);
    }

    private static void asterik2(int n) {
        if(n == 0){
            return;
        }
        System.out.print("*");
        asterik2(n-1);
    }
    private static void print2(int n,int numCopy) {
        if(n == 0){
            return;
        }
            // space
            space(n-1);
            //asterik
        asterik2(numCopy-n+1);
            //new line
            System.out.println();
            // recursilve callong
            print2(n-1,numCopy);
        }

    static void print3(int n , int numCopy){
        if(n == 0){
            return;
        }
        // star
        asterik(numCopy - n + 1);
        //new line
        System.out.println();
        print3(n-1,numCopy);
    }


    static void printNum(int n,int numToPrint){
        if(n == 0){
            return;
        }
        System.out.print(numToPrint+" ");
        printNum(n-1,numToPrint);
    }
    static void print4(int n , int numCopy){
        if(n == 0){
            return;
        }
        // num to print
        printNum(numCopy - n + 1,numCopy - n + 1);
        //new line
        System.out.println();
        print4(n-1,numCopy);
    }

    static void print5(int n , int numCopy){
        if(n == 0){
            return;
        }
        // num to print
        printChar(numCopy - n + 1,numCopy - n + 1);
        //new line
        System.out.println();
        print5(n-1,numCopy);
    }

    private static void printChar(int n, int numToPrint) {
        if(n == 0){
            return;
        }
        char alphabet = (char)(numToPrint + 64);
        System.out.print(alphabet + " ");
        printChar(n-1,numToPrint);
    }
}
