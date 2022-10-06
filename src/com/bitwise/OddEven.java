package com.bitwise;

public class OddEven {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        oddEven(n1);
        oddEven(n2);
     }

     static void oddEven(int n){
        if( (n&1)==0 ){
            System.out.println(n+ " is even");
        }else{
            System.out.printf(n+ " is odd");
        }
     }
}
