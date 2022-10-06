package com.stringRecursion.backtracking;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = new int[][] {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board)){
          displayBoard(board);
        }else{
            System.out.println("sudoku cannot be solved");
        }

    }

    private static void displayBoard(int[][] board) {
       for (int [] row : board){
           for (int element : row){
               System.out.print(element+" ");
           }
           System.out.println();
       }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        boolean boardSorted = true;
        int row = -1;
        int col = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){ // empty element found
                    row = i;
                    col = j;
                    boardSorted = false;
                    break;
                }
            }
            if(!boardSorted){
                break;
            }
        }
        //if board is sorted then return;
        if(boardSorted){
            return true;
        }
        // try to put numbers 1 to 9
        for (int num = 1; num <= 9 ; num++) {
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                boolean potentialAnsFound =  solve(board);
                if(potentialAnsFound){
                    return true;
                }else{
                    //backtracking
                    board[row][col] = 0;
                }
            }
        }
        return false; // not found
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //check row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        //check col
        for (int j = 0; j < board.length; j++) {
            if(board[j][col] == num){
                return false;
            }
        }
        //check 3*3 matrix
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        // 0,1,2    3,4,5   6,7,8
       // it shd run 3 times to get above and rowStart already has one number among that
        for (int k = rowStart; k < rowStart+sqrt; k++){
            for (int l = colStart; l < colStart+sqrt; l++){
                if(board[k][l] == num){
                    return false;
                }
            }
        }
        return true; // everything alright
    }
}
