package com.stringRecursion.maze;

import java.util.ArrayList;
import java.util.List;

public class MazePathsRightDown {

    public static void main(String[] args) {
        pathRD("",3,3);
        System.out.println(pathRDRet("",3,3));
        // with right,down,diagonal
        System.out.println();
        pathRDDiagonal("",3,3);
    }

    private static void pathRDDiagonal(String p, int r, int c) {
        // base condition
        if(r ==1 && c ==1){
            System.out.println(p);
            return;
        }

        // digonal
        if(r > 1 && c > 1){
            pathRDDiagonal(p+'D',r-1,c-1);
        }
        //down
        if(r > 1){
            pathRDDiagonal(p+'V',r-1,c);
        }
        //right
        if(c > 1){
            pathRDDiagonal(p+'H',r,c-1);
        }
    }

    private static void pathRD(String p, int r, int c) {
        // base condition
        if(r ==1 && c ==1){
            System.out.println(p);
            return;
        }

        // b
        //down
        if(r > 1){
            pathRD(p+'D',r-1,c);
        }
        //right
        if(c > 1){
            pathRD(p+'R',r,c-1);
        }
    }

    private static List<String> pathRDRet(String p, int r, int c) {
        // base condition
        if(r ==1 && c ==1){
            List<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> listans =  new ArrayList<>();
        //down
        if(r > 1){
            listans.addAll(pathRDRet(p+'D',r-1,c));
        }
        //right
        if(c > 1){
            listans.addAll(pathRDRet(p+'R',r,c-1));
        }
        return listans;
    }

}
