package com.recursion.arrays;

import java.util.ArrayList;

public class SearchInArray {

    static ArrayList<Integer> stList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,4,6,7};
        int target = 4;
        System.out.println("target present "+booleanSearch(arr,0,target));
        System.out.println("target present booleanSearchOptimised "+booleanSearchOptimised(arr,0,target));

        ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<Integer> ans = findIndex(arr,0,target,list);
        System.out.println("list is "+ans);

        stFindIndex(arr,0,target);
        System.out.println("static list  "+stList);

        ArrayList<Integer> addAllList = findIndex2(arr,0,target);
        System.out.println("addAllList "+addAllList);
    }

    private static ArrayList<Integer> findIndex2(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> listFromBottom =  findIndex2(arr,i+1,target);
        list.addAll(listFromBottom);
        return list;
    }

    private static void stFindIndex(int[] arr, int i, int target) {
        if(i == arr.length){
            return;
        }
        if(arr[i] == target){
            stList.add(i);
        }
        stFindIndex(arr,i+1,target);
    }
    private static ArrayList<Integer> findIndex(int[] arr, int i, int target, ArrayList<Integer> list) {
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return findIndex(arr,i+1,target,list);
    }


    private static boolean booleanSearch(int[] arr, int i,int target) {
        // base condition
        if(i == arr.length){
            return false;
        }
        if(arr[i] == target){
            return true;
        }
        return booleanSearch(arr,i+1,target);

    }
    private static boolean booleanSearchOptimised(int[] arr, int i,int target) {
        // base condition
        if(i == arr.length){
            return false;
        }

        return (arr[i] == target) || booleanSearchOptimised(arr,i+1,target);

    }



}
