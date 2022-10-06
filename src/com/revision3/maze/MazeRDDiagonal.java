package com.revision3.maze;

import java.util.ArrayList;
import java.util.List;

public class MazeRDDiagonal {

    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        maze(board,"",0,0);
        System.out.println();
        List<String> ans = mazeRet(board,"",0,0);
        System.out.println("ans is "+ans);
    }

    private static void maze(boolean[][] board, String p,int row, int col) {
        // base condition
        if(row == board.length - 1 && col == board.length - 1){
            System.out.println(p);
            return;
        }

        // blockage
        if(!board[row][col]){
            return;
        }

        //down
        if(row < board.length - 1){
            maze(board,p+"D",row+1,col);
        }
        //right
        if(col < board.length - 1){
             maze(board,p+"R",row,col+1);
        }
        //diagonal
        if(row < board.length - 1 && col < board.length - 1){
         maze(board,p+"G",row+1,col+1);
        }

    }

    private static List<String> mazeRet(boolean[][] board, String p, int row, int col) {
        // base condition
        if(row == board.length - 1 && col == board.length - 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }



        List<String> list = new ArrayList<>();
        // blockage
        if(!board[row][col]){
            return list;
        }
        //down
        if(row < board.length - 1){
            list.addAll(mazeRet(board,p+"D",row+1,col));
        }
        //right
        if(col < board.length - 1){
            list.addAll(mazeRet(board,p+"R",row,col+1));
        }
        //diagonal
        if(row < board.length - 1 && col < board.length - 1){
            list.addAll(mazeRet(board,p+"G",row+1,col+1));
        }
        return  list;
    }

}
