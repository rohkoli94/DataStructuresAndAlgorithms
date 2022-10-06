package com.stringRecursion.maze;

public class MazeCount {

    public static void main(String[] args) {
        // count ways to reach destination with right and down
        System.out.println(countRD(3,3));
    }

    private static int countRD(int r, int c) {
        // base condition
        if(r == 1 || c == 1){
            return 1;
        };
        int left  = countRD(r-1,c);
        int right = countRD(r,c-1);

        return left+right;
    }
}
