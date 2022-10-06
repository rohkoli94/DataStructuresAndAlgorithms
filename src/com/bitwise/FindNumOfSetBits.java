package com.bitwise;

public class FindNumOfSetBits {

    public static void main(String[] args) {
        int n = 3;

        find(n);
    }

    static void find(int n){
        int counter = 0;

        while(n>0){
            int temp = n &1;
            if(temp == 1){
                counter++;
            }
            n = n >>1;
        }
        System.out.println("ans is "+counter);
    }
}
