package com.stringRecursion.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n= 4;
        boolean[][] board = new boolean[n][n];
        checkKnights(board,0,0,n);
    }

    private static void checkKnights(boolean[][] board, int row, int col, int knightToAdd) {
        // base conditions
        // if knightToAdd is 0,then display board
        if(knightToAdd == 0){
            displayBoard(board);
            System.out.println();
            return;
        };

        // handle outer end corner case (last row and col outside)
        if(row == board.length - 1 && col == board.length) {
            return;
        }

        // handle row column corner case; if outside go below and start from 0 again
        if(col == board.length){
            checkKnights(board,row +1,0,knightToAdd);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true; // backtracking condition
            checkKnights(board,row,col+1,knightToAdd-1);
            board[row][col] = false;// backtracking condition reverted
        }

        // just move cursor ahead
        checkKnights(board,row,col+1,knightToAdd);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check conditions isValid ( to avoid index out of bound error) on 4 conditions of below as starting row will be exceptions
        // top left
        if(isValid(board,row -2,col-1)){
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
        // side right top
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){ // knight present
                return false;
            }
        }
        // side left top
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){ // knight present
                return false;
            }
        }
        return true; // everything alright
    }

    private static boolean isValid(boolean[][] board,int row, int col) { // to avoid index out of bound error
        if(row >=0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void displayBoard(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                };
            };
            System.out.println();
        }
    }
}
