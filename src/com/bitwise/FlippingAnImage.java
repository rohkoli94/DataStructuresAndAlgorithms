package com.bitwise;

import java.util.Arrays;


public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{0,0,0},{0,1,1}};

        flip(matrix);
    }

    private static void flip(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < (m[i].length +1)/ 2; j++) {
                int temp = m[i][j] ^ 1;
                m[i][j] = m[i][m[i].length - 1 - j] ^ 1;
                m[i][m[i].length - 1 - j] = temp;
            }
            System.out.println("arr for"+i +" is "+Arrays.toString(m[i]));
        }

    }
}
