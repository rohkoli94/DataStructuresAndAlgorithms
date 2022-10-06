package com.revision3.maze;

public class CountWaysRD {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(count(0,0,n));
    }

    private static int count(int row, int col, int n) {
        // base condition
        if(row == n - 1 || col == n - 1){
            return 1;
        }
        // right
        int left = count(row,col+1,n);
        //down
        int right = count(row+1,col,n);

        return left + right;
    }
}
