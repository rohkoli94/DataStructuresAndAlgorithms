package com.bitwise;

public class PositionOfRightMostSetBit {

    public static void main(String[] args) {
        int n = 14;
        rightMost(n);
    }

    private static void rightMost(int n) {
        // 10011
        int counter =1;
        while(n>0){
            n = (n&1);
            if(n == 1){
                System.out.println("right most set bit is "+counter);
            return;
            }
            counter++;
            n = n>>1;
        }
        System.out.println("not found");
    }
}
