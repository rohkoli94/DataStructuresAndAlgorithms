package com.binarySearch;

import java.util.Arrays;

public class MatrixRowWiseColumnWiseSortedSearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {15,25,35},
                {18,28,38}
        };

        int target = 18;
        System.out.println("ans is "+ Arrays.toString(find(matrix,target)));
    }

static int[] find(int[][]matrix, int target){

        int row = 0;
        int col = matrix[0].length -1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
    return new int[]{-1, -1};
}


}
