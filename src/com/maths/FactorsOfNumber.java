package com.maths;

import java.util.ArrayList;

public class FactorsOfNumber {

    public static void main(String[] args) {
        int n = 36;
        factors(n);
    }

    private static void factors(int n) {

        ArrayList<Integer> arr = new ArrayList();
        for (int i = 1; i*i <= n ; i++) {
            if(n%i==0){

                if(n/i==i){
                    System.out.print(i+" ");

                }else{
                    System.out.print(i+" ");
                    arr.add((n/i));
                }
            }
        }

        for (int j = arr.size()-1; j>=0; j--) {
            System.out.print(arr.get(j)+" ");
        }
    }
}
