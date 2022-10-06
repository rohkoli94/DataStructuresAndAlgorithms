package com.revision3.strings;

public class Permutation {

    public static void main(String[] args) {
        String s = "abc";
        solve("",s);
    }

    private static void solve(String p, String up) {
        // base condition
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int n = p.length();

        char ch = up.charAt(0);
        for (int i = 0; i <= n ; i++) {  // + 1 gives answwr
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            String ans= first + ch + second;
         solve(ans,up.substring(1));
        }

    }
}
