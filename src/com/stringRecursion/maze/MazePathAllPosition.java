package com.stringRecursion.maze;

import java.util.Arrays;

public class MazePathAllPosition {

    public static void main(String[] args) {
        boolean[][] block = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        //print all possible paths to reach destination
        //printPaths("",block,0,0);

        // print paths and steps inside matrix tp reach destination
        int[][] stepMatrix = new int[block.length][block[0].length];
        printPathSteps("",block,0,0,stepMatrix,1);
    }

    private static void printPathSteps(String p, boolean[][] matrix, int r, int c, int[][] stepMatrix, int steps) {
        // base condition
        if(r == matrix.length -1 && c == matrix[0].length -1){
            stepMatrix[r][c] = steps;
            for(int[] arr : stepMatrix){
                System.out.println(Arrays.toString(arr));
            }
            System.out.print(p + " ");
            System.out.println();
            System.out.println();
            return;
        }

        // blocking condition (river or already visited) ; to stop recursion
        if(!matrix[r][c]){
            return;
        }

        matrix[r][c] = false; // backtracking condition (to avoid stackoverflow error)
        stepMatrix[r][c] = steps;// backtracking condition (keeping track of steps in single array)

        // down
        if(r < matrix.length - 1){
            printPathSteps(p+'D',matrix,r+1,c,stepMatrix,steps+1);
        }
        // right
        if(c < matrix[0].length - 1){
            printPathSteps(p+'R',matrix,r,c+1,stepMatrix,steps+1);
        }
        // up
        if(r > 0){
            printPathSteps(p+'U',matrix,r-1,c,stepMatrix,steps+1);
        }
        // left
        if(c > 0){
            printPathSteps(p+'D',matrix,r,c-1,stepMatrix,steps+1);
        }

        matrix[r][c] = true;// backtracking condition (reverted)
        stepMatrix[r][c] = 0;// backtracking condition (reverted)
    }

    private static void printPaths(String p,boolean[][] matrix, int r, int c) {
        // base condition
        if(r == matrix.length -1 && c == matrix[0].length -1){
            System.out.print(p + " ");
            return;
        }
        // blocking condition (river) ; if river found return and stop recursion
        if(!matrix[r][c]){
            return;
        }

        matrix[r][c] = false; // backtracking condition

        // down
        if(r < matrix.length - 1){
            printPaths(p+'D',matrix,r+1,c);
        }
        // right
        if(c < matrix[0].length - 1){
            printPaths(p+'R',matrix,r,c+1);
        }
        // up
        if(r > 0){
            printPaths(p+'U',matrix,r-1,c);
        }
        // left
        if(c > 0){
            printPaths(p+'D',matrix,r,c-1);
        }

        matrix[r][c] = true;// backtracking condition (reverted)
    }
}
