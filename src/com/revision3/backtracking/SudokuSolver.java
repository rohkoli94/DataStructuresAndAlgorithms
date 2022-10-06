package com.revision3.backtracking;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = new int[][]{
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

    private static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean sodokuSolved = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    sodokuSolved = false;
                    break;
                }
            }
            if (!sodokuSolved) {
                break;
            }
        }

        // base condition
        if (sodokuSolved) {
            return true;
        }

        // try to put 1-9 numbers in empty cell
        for (int num = 1; num <= 9 ; num++) {
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                boolean foundPotentialAns = solve(board);
                if(foundPotentialAns){
                    return true;
                }else{
                    // backtracking
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // check row and col
        for (int i = 0; i < 9 ; i++) {
            // check row
            if(board[row][i] == num){
                return false;
            }
            // check col
            if(board[i][col] == num){
                return false;
            }
        }

        // check 3*3 matrix
        // starting position of matrix
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt ; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

    private static void displayBoard(int[][] board) {
        for(int[] row : board){
            for (int element : row){
                    System.out.print(element+" ");
            }
            System.out.println();
        }
    }


}