package com.stringRecursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean [n][n];
//        print count
        System.out.println( checkqueens(board,0));
    }

    private static int checkqueens(boolean[][] board, int row) {
        // base condition
        if(row == board.length){
            // display board
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // put queen inside satisfying colum of eac row
        for (int col = 0; col < board.length; col++) {
            //check queen is safe or not
            if(isSafe(board,row,col)){
                board[row][col] = true; // backtracking conditon
                count+= checkqueens(board,row+1);
                board[row][col] = false; // backtracking conditon terminated
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check top
        for (int i = 0; i < row; i++) {
            if(board[i][col]){ // already queen present
                return false;
            }
        }
        // check left diagonal
        int leftMax = Math.min(row,col);
        for (int j = 1; j <= leftMax; j++) {
            if(board[row - j][col - j]){ // already queen present
                return false;
            }
        }
        // check right diagonal
        int rightRemainingLength = board.length - col - 1;
        int rightMax = Math.min(row,rightRemainingLength);
        for (int k = 1; k <= rightMax; k++) {
            if(board[row - k][col + k]){ // already queen present
                return false;
            }
        }

        // if top , left diagonal , right diagonal are proper then return true (queen is safe to put)
        return true;
    }

    private static void displayBoard(boolean[][] board) {
       for(boolean[] row : board){
           for (boolean element :row){
               if(element){
                   System.out.print("Q ");
               }else{
                   System.out.print("X ");
               }
           }
           System.out.println();
       }
    }
}
