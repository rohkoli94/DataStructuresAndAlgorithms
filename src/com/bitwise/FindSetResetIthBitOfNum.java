package com.bitwise;

public class FindSetResetIthBitOfNum {

    public static void main(String[] args) {
        int n = 14;
        int i = 3;
        find(n,i);
        set(n,i);
        reset(n,i);

    }

    static void find(int n,int i){
        for (int j = 1; j < i; j++) {
            n = (n >> 1);
        }
        int ans = (n &1);
        System.out.println("ith bit is direct print "+(n &1));
        System.out.println("ith bit is "+ans);
    }

    static  void set(int n,int i){
        int mask = 1<<(i-1);
        int ans = (n|mask);
        System.out.println("set number is direct print "+ (n | 1<<(i-1)) );
        System.out.println("set number is "+ans);
    }

    static  void reset(int n,int i){
//     n = 10100  ;i = 3
//mask =   11011
// comp =  00100
        int maskTemp = 1<<(-1);
        int mask = (~maskTemp);
        int ans = (n&mask);
        System.out.println("reset number is direct print "+ (n & (~(1<<(-1)))) );
        System.out.println("reset number is "+ans);
    }
}
