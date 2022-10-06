package com.revision3.backtracking;

public class Nknights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        solve(board,0,0,n);
    }

    private static void solve(boolean[][] board, int row, int col, int knightsRemaining) {
        int n = board.length;

        if(knightsRemaining == 0){
            displayBoard(board);
            System.out.println();
            return;
        }
        // if last row and col is outside, don't go down
        if(row == n -1 && col == n){
            return;
        }
        // go down
        if(col == n){
            solve(board,row+1,0,knightsRemaining);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            solve(board,row,col+1,knightsRemaining - 1);
            board[row][col] = false; // backtracking
        }
        // move ahead
        solve(board,row,col+1,knightsRemaining);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check 4 conditions and avoid out if bound error
        // top left
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){ // knight present
                return false;
            }
        }
        // top right
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){ // knight present
                return false;
            }
        }
        // side left top
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){ // knight present
                return false;
            }
        }
        // side right top
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){ // knight present
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return  false;
    }

    private static void displayBoard(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean  element : row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}
