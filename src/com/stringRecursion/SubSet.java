package com.stringRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> ans = subset(arr);
       // System.out.println("ans is " + ans);
        // loop and print innerList if needed
        for (List<Integer> list : ans){
            System.out.print(list+" ");
        }

        System.out.println();
        // with duplicates pending *****
        int[] arr1 = {1, 2, 2}; //or {1,2,1}
        List<List<Integer>> ans1 = subsetDup(arr1);
        System.out.println("with dup is "+ans1);
    }

    private static List<List<Integer>> subsetDup(int[] arr) {
        //sort the array as 1,2,1 will not be used for tracking as continuous elements are not there
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = 0;
            // check duplicate
            if(i > 0 && arr[i] == arr[i-1]){
                s = e + 1; // as we need copy of this below
            }
            e = outer.size() -1; //as we need index of BEFORE previously added elements;
            /*
                [],[1]e,[2],[1,2]
                we can use end and do end+1 to make copy of [2],[1,2] below for duplicate element
                [2,2][1,2,2]
                [],[1],[2],[1,2] [2,2][1,2,2] --> final answer
            */
            int n = outer.size();

            for (int j = s; j < n; j++) {
                //adding innerlist i.e actual list
                List<Integer> innerList = new ArrayList<>(outer.get(j));
                innerList.add(arr[i]);
                outer.add(innerList);
            }

        }
        return outer;
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                 inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

}
