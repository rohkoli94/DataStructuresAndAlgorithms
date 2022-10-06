package com.maths;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        fact(n);
    }

    static void fact(int n){
    int n1=0;
    int n2=1;
        System.out.print(n1 +" "+ n2+" ");
        for (int i = 3; i <= n ; i++) {
        int n3 = n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }

    }
}
