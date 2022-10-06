package com.revision3.maze;

public class AllPosiitons {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] stepsmatrix = new int[board.length][board.length];

        maze(board,"",0,0);
        System.out.println("-----------------");
        mazeSteps(board,"",0,0,stepsmatrix,1);
    }

    private static void maze(boolean[][] board,String p, int row, int col) {
        // base condition
        if(row == board.length  - 1 && col == board.length  - 1){
            System.out.println(p);
            return;
        }

        // blockage
        if(!board[row][col]){
            return;
        }

        board[row][col] = false; // visited

        //left
        if(col > 0){
            maze(board,p+"L",row,col-1);
        }
        //right
        if(col < board.length - 1){
            maze(board,p+"R",row,col+1);
        }

        //top
        if(row > 0){
            maze(board,p+"R",row - 1,col);
        }
        //down
        if(row < board.length - 1){
            maze(board,p+"R",row + 1,col);
        }

        board[row][col] = true; // backtracking
    }

    private static void mazeSteps(boolean[][] board,String p, int row, int col,int[][] matrix, int steps) {
        // base condition
        if(row == board.length  - 1 && col == board.length  - 1){
            matrix[row][col] = steps;
            for (int[] rows: matrix){
                for (int num : rows){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // blockage
        if(!board[row][col]){
            return;
        }

        board[row][col] = false; // visited
        matrix[row][col] = steps;

        //left
        if(col > 0){
            mazeSteps(board,p+"L",row,col-1,matrix,steps + 1);
        }
        //right
        if(col < board.length - 1){
            mazeSteps(board,p+"R",row,col+1,matrix,steps + 1);
        }

        //top
        if(row > 0){
            mazeSteps(board,p+"R",row - 1,col,matrix,steps + 1);
        }
        //down
        if(row < board.length - 1){
            mazeSteps(board,p+"R",row + 1,col,matrix,steps + 1);
        }

        board[row][col] = true; // backtracking
        matrix[row][col] = 0;
    }
}
