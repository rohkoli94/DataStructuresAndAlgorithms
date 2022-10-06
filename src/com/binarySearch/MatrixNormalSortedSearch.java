package com.binarySearch;

import java.util.Arrays;

public class MatrixNormalSortedSearch {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 22;

        System.out.println("ans is "+Arrays.toString(find(matrix,target)));
    }

    static int[] find(int[][] matrix, int target){
        int col = (matrix.length / 2) - 1;

        int rowS = 0;
        int rowE = matrix.length -1;

        while(rowS <= rowE){
            int mid = rowS + (rowE -rowS) /2;
            if(target == matrix[mid][col]){
                return new int[]{mid,col};
            }
            if(target > matrix[mid][col]){
                rowS = mid + 1;
            }else{
                rowE = mid -1;
            }
        }

        // int the end 2 rows will be remaining
        int rowFirst, rowSecond; // keeo in asc

        if(rowS == matrix.length){
            rowFirst = matrix.length - 2;
            rowSecond = matrix.length - 1;
        }else if(rowE == -1){
            rowFirst = 0;
            rowSecond = 1;
        }else{
            rowFirst = rowE;
            rowSecond = rowS;
        }

        // check
        int collength = matrix[rowFirst].length -1; // or matrix[rowSecond].length -1;
        int colFound = -1;
        if(target <= matrix[rowFirst][collength]){
            // it lies in first array
            //do bs on first
            colFound = binarySearchAsc(matrix[rowFirst],0,collength,target);
            if(colFound != -1){
                return new int[]{rowFirst,colFound};
            }
        }else{
            colFound = binarySearchAsc(matrix[rowSecond],0,collength,target);
            if(colFound != -1){
                return new int[]{rowSecond,colFound};
            }
        }
        return new int[]{-1,-1};


    }

    static int binarySearchAsc(int arr[],int s,int e,int target){

        if(arr.length == 0 ){
            return -1;
        }
        while(s<=e){
            int mid = s + (e-s) / 2;
            if(target > arr[mid]) {
                s = mid + 1;
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
