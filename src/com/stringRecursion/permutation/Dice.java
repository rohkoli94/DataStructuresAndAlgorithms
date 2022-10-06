package com.stringRecursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static void main(String[] args) {
        int target = 4;
        dice("",target);

        List<String> ans  = diceRet("",target);
        System.out.println();
        System.out.println("ret ans is "+ans);

    }

    private static List<String> diceRet(String p, int up) {
        // base condition
        if(up == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= up ; i++) {
            ans.addAll(diceRet(p+i,up-i));
        }
        return  ans;
    }

    private static void dice(String p, int up) {
        // base condition
        if(up == 0){
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= up ; i++) {
            dice(p+i,up -i);
        }
    }
}
