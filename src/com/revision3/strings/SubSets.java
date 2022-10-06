package com.revision3.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        List<List<Integer>>  list = subset(arr);
        for (List<Integer> innerList : list){
            if(innerList.size() != 0){
                System.out.print(innerList+" ");
            }
        }

        System.out.println("----------");
        int[] arr1 = new int[]{1,2,2};

        List<List<Integer>>  list1 = subsetDup(arr1);
        for (List<Integer> innerList1 : list1){
            if(innerList1.size() != 0){
                System.out.print(innerList1+" ");
            }
        }
    }

    private static List<List<Integer>>  subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList());

        for (int i = 0; i < arr.length; i++) {
             int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    private static List<List<Integer>>  subsetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList());


        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = 0;

            int n = outer.size();
            if(i > 0 && arr[i-1] == arr[i]){ // dup
                s = e + 1;
            }
            e = outer.size() - 1;
            for (int j = s; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
