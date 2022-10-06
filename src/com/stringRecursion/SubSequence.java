package com.stringRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

    public static void main(String[] args) {

        String str = "abc";
        //printing inside body
        subSeq("",str);

        // returning Arraylist
        System.out.println();
        ArrayList<String> ans = subSeq2("",str);
        System.out.println("arraylist ans is "+ans);
    }

    private static ArrayList<String> subSeq2(String p, String up) {
        //base condition
        if(up.isEmpty()){
            // handle empty case for processed string
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }

        //make 2 calls (TAKE IT and IGNORE IT)
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq2(p+ch,up.substring(1));// take it i.e take first element and add to your previous answer
        ArrayList<String> right = subSeq2(p,up.substring(1)); // ignore it i.e ignore forst element and add to your previous answer

        left.addAll(right);
        return left;
    }

    private static void subSeq(String p, String up) {
        //base condition
        if(up.isEmpty()){
            System.out.print(p+" ");
            // handle empty case for processed string
            return;
        }

        //make 2 calls (TAKE IT and IGNORE IT)
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));// take it i.e take first element and add to your previous answer
        subSeq(p,up.substring(1)); // ignore it i.e ignore forst element and add to your previous answer
    }


}
