package com.revision3.backtracking;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("count "+solve(board,0));

    }

    private static int solve(boolean[][] board, int row) {
        //base condition
        if(row == board.length){
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // check col
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+= solve(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check top
        for (int i = 0; i < row; i++) {
            if(board[i][col]){ // queen present
                return false;
            }
        }
        // check top left diagonal
        int leftMax = Math.min(row,col);
        for (int k = 1; k <= leftMax; k++) {
            if(board[row-k][col-k]){
                return false;
            }
        }
        // check top right diagonal
        int rightMax = Math.min(row,board.length  - 1- col);
        for (int j = 1; j <= rightMax; j++) {
            if(board[row-j][col+j]){
                return false;
            }
        }
        return true;
    }

    private static void displayBoard(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element) {
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
