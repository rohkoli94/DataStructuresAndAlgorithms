package com.revision3.strings;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subseq("",s));
    }

    private static List<String> subseq(String p, String up) {
        // base condition
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            if(!p.isEmpty()){
                ans.add(p);
            }
            return ans;
        }

        // take
        List<String> left = subseq(p+up.substring(0,1),up.substring(1));
        //ignore it
        List<String> right = subseq(p,up.substring(1));
        left.addAll(right);
        return left;

    }
}
