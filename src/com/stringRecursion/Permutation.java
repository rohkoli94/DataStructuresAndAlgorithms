package com.stringRecursion;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

        String str = "abc";
        permutation("",str);

        System.out.println();
        ArrayList<String> ans =  permutationRet("",str);
        System.out.println("permutation using return "+ans);

        //count of permutation
        int count = countPermutation("",str);
        System.out.println("count is "+count);
    }

    private static int countPermutation(String p, String up) {
        // base condiion
        if(up.isEmpty()){
            return 1;
        }
        // processed string length -> gives next answer using + 1 in for loop
        int n = p.length();
        char ch = up.charAt(0);

        int count= 0;
        for (int i = 0; i <= n ; i++) { // i <=n  as we need length + 1
            String first = p.substring(0,i);
            String second = p.substring(i,n);

            count = count + countPermutation(first+ch+second, up.substring(1));
        }

        return count;
    }

    private static void permutation(String p, String up) {
        // base condiiton
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        // processed string length -> gives next answer using + 1 in for loop
        // first = (0,i)
        // second = (i,n);
        // ans = first +char+ second    (derived using diagram)
        int n = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i <= n; i++) { // i <=n  as we need length + 1
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            permutation(first+ch+second, up.substring(1));
        }
    }

    private static ArrayList<String> permutationRet(String p, String up) {
        // base condition
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        // processed string length -> gives next answer using + 1 in for loop
        // first = (0,i)
        // second = (i,n);
        // ans = first +char+ second    (derived using diagram)
        int n = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i <= n; i++) { // i <=n  as we need length + 1
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            ans.addAll( permutationRet(first+ch+second, up.substring(1)) );
        }

        return ans;
    }
}
